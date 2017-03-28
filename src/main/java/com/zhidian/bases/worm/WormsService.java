/**
 * @Title: WormsService.java
 * @Package com.zhidian.bases.worms
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-21 上午3:32:14
 * @version V1.0
 */
package com.zhidian.bases.worm;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhidian.bases.EnumWebSiteDefine;
import com.zhidian.bases.worms.pipeline.SegmentFaultSearchPipeline;
import com.zhidian.bases.worms.processor.SegmentFaultProcessor;
import com.zhidian.model.PullDataTaskModel;
import com.zhidian.util.RegExpUtils;
import com.zhidian.views.ResultPageDTO;
import com.zhidian.views.SearchResultVO;

import us.codecraft.webmagic.Spider;

/**
 * @ClassName: WormsService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午3:32:14
 * 
 */
@Service
public class WormsService {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	SegmentFaultSearchPipeline pipeline;
	
	@Autowired
	PullBaseService pullService;

	// 单线程实现
	public List<SearchResultVO> pullOnlineData(String type, String query) {
		if (type != null) {
			// 暂定segmentfault
			String url = "https://segmentfault.com/search?q=" + query;
			// 爬取搜索页面
			Spider.create(new SegmentFaultProcessor()).addPipeline(pipeline).get(url);
			return pipeline.getResults();
		}
		return null;
	}

	// 同步爬蟲失敗
	public List<SearchResultVO> pullOnlineDataWithThreading(String type, String query) {
		if (type != null) {
			// 暂定segmentfault
			String url = "https://segmentfault.com/search?q=" + query;
			// 爬取搜索页面
			SegmentFaultSearchPipeline pipeline = new SegmentFaultSearchPipeline();
			synchronized (SegmentFaultSearchPipeline.class) {
				log.info("onlinePullDataThreading :1 ->{}", pipeline);
				Spider.create(new SegmentFaultProcessor()).addPipeline(pipeline).addUrl(url).thread(3).start();
				log.info("onlinePullDataThreading :2 ->{}", pipeline);
			}
			log.info("onlinePullDataThreading :3 ->{}", pipeline);
			return pipeline.getResults();

		}
		return null;
	}

	public List<ResultPageDTO> getResultsByOnlineSearch(String key, String from) {
		// 从网络上获取，拼接
		// from 格式: segmentfault|cnblog|ibmdeveloper
		List<PullDataTaskModel> models = null;
		if (!StringUtils.isEmpty(from)) {
			// 正则验证，从缓存/数据库中拿去segmentfault对应的class【暂定写死】
			List<String> arr = RegExpUtils.convertString2List(from);
			if (arr != null && arr.size() > 0) {
				models = new ArrayList<PullDataTaskModel>();
				PullDataTaskModel model = null;
				for (String str : arr) {
					if (!StringUtils.isEmpty(str)) {
						// 取出处理器
						EnumWebSiteDefine enumObj = EnumWebSiteDefine.valueOf(str);
						if (enumObj != null) {
							model = new PullDataTaskModel(enumObj.name(), enumObj.getProcessor(), enumObj.getPipeline(),
									enumObj.getUrl());
							models.add(model);
						}
					}
				}
			}
		} else {
			// 定义规则，哪些页面是默认取数据的来源。可以从数据库定义。可以从缓存/数据库中取
			models = new ArrayList<PullDataTaskModel>();
			EnumWebSiteDefine enumObj = EnumWebSiteDefine.valueOf("segmentfault");
			PullDataTaskModel model = new PullDataTaskModel(enumObj.name(), enumObj.getProcessor(),
					enumObj.getPipeline(), enumObj.getUrl());
			models.add(model);
		}
		if (models != null && models.size() > 0) {
			// 进入数据爬去队列
			return pullService.startPullPageDataFromList(models);
		}
		return null;
	}

}
