/**
 * @Title: WormsService.java
 * @Package com.zhidian.bases.worms
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-21 上午3:32:14
 * @version V1.0
 */
package com.zhidian.bases.worms;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import us.codecraft.webmagic.Spider;

import com.zhidian.bases.worms.pipelines.SegmentFaultSearchPipeline;
import com.zhidian.bases.worms.processors.SegmentFaultProcessor;
import com.zhidian.configs.CommonSpiderConfigs;
import com.zhidian.views.SearchResultVO;

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
	CommonSpiderConfigs commonConfig;
	
	
	
	// 单线程实现
	public List<SearchResultVO> onlinePullData(String type, String query) {
		if (type != null) {
			// 暂定segmentfault
			String url = "https://segmentfault.com/search?q=" + query;
			// 爬取搜索页面
			SegmentFaultSearchPipeline pipeline = new SegmentFaultSearchPipeline();
			Spider.create(new SegmentFaultProcessor()).addPipeline(pipeline)
					.get(url);
			return pipeline.getResults();
		}
		return null;
	}

	// 同步爬蟲失敗
	public List<SearchResultVO> onlinePullDataThreading(String type,
			String query) {
		if (type != null) {
			// 暂定segmentfault
			String url = "https://segmentfault.com/search?q=" + query;
			// 爬取搜索页面
			SegmentFaultSearchPipeline pipeline = new SegmentFaultSearchPipeline();
			synchronized (SegmentFaultSearchPipeline.class) {
				log.info("onlinePullDataThreading :1 ->{}", pipeline);
				Spider.create(new SegmentFaultProcessor())
						.addPipeline(pipeline).addUrl(url).thread(3).start();
				log.info("onlinePullDataThreading :2 ->{}", pipeline);
			}
			log.info("onlinePullDataThreading :3 ->{}", pipeline);
			return pipeline.getResults();

		}
		return null;
	}

}
