/**
 * @Title: SegementFaultPipeline.java
 * @Package com.zhidian.bases.worms.pipelines
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-21 上午1:07:15
 * @version V1.0
 */
package com.zhidian.bases.worms.pipeline;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zhidian.bases.worms.processor.BasePageProcessor;
import com.zhidian.mapper.ArticleMapper;
import com.zhidian.mapper.CssMapper;
import com.zhidian.views.SearchResultVO;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * @ClassName: SegementFaultPipeline
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午1:07:15
 * 
 */
@Component
public class SegmentFaultSearchPipeline implements Pipeline {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public SegmentFaultSearchPipeline() {
		this.results = null;
		log.info("SegmentFaultSearchPipeline :1 ->{}", results);
	}

	private List<SearchResultVO> results ;

	@Autowired
	ArticleMapper articleMapper;

	@Autowired
	CssMapper cssMapper;

	@Override
	public void process(ResultItems resultItems, Task task) {
		// 差別校验
		// 保存入数据库，Article、Css、
		// 模板
		// [暂定直接json显示]
		log.info("SegmentFaultSearchPipeline :2 ->{}", results);
		results = resultItems.get(BasePageProcessor.STATIC_NAME_CONTENT);
		log.info("SegmentFaultSearchPipeline :3 ->{}", results);
		if(results!=null&&results.size()>0){
			for(SearchResultVO s : results){
				System.out.println(s);
			}
		}
		if(articleMapper!=null){
			System.out.println(articleMapper);
		}else{
			System.out.println("article mapper is null!!!!");
		}
	}

	/**
	 * @return the results
	 */
	public List<SearchResultVO> getResults() {
		return results;
	}
}
