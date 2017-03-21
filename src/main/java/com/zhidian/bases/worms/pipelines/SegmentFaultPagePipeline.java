
/**
* @Title: SegementFaultPipeline.java
* @Package com.zhidian.bases.worms.pipelines
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午1:07:15
* @version V1.0
*/
package com.zhidian.bases.worms.pipelines;

import org.springframework.beans.factory.annotation.Autowired;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import com.zhidian.mappers.ArticleMapper;
import com.zhidian.mappers.CssMapper;

/**
 * @ClassName: SegementFaultPipeline
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午1:07:15
 *
 */
public class SegmentFaultPagePipeline implements Pipeline{

	@Autowired
	ArticleMapper articleMapper;
	
	@Autowired
	CssMapper cssMapper;
	
	@Override
	public void process(ResultItems resultItems, Task task) {
		// 差別校验
		
		// 保存入数据库，Article、Css、
		
		// 模板
		
	}

}
