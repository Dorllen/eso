
/**
* @Title: SegmentFaultPageProcessor.java
* @Package com.zhidian.bases.worms.processors
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午12:42:15
* @version V1.0
*/
package com.zhidian.bases.worms.processors;

import java.util.ArrayList;
import java.util.List;

import com.zhidian.views.SearchResultVO;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.monitor.SpiderMonitor;
import us.codecraft.webmagic.selector.Selectable;

/**
 * @ClassName: SegmentFaultPageProcessor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午12:42:15
 *
 */
public class SegmentFaultPageProcessor extends BasePageProcessor{
	
	@Override
	public void process(Page page) {
		if(isCss(page.getUrl())){
			// 加入 css 解决器中..
		}else{
			// 加入
			Selectable select = page.getHtml().xpath(
					"//div[@class~='main']");
			List<Selectable> resultList = select.nodes();
			if (resultList != null && resultList.size() > 0) {
				List<SearchResultVO> results = new ArrayList<SearchResultVO>(
						resultList.size());
				SearchResultVO searchVO;
				for (Selectable result : resultList) {
					searchVO = new SearchResultVO();
					// 解析tile
					searchVO.setTitle(result.xpath(
							"//h2[@class='h4']/a[1]/text()").toString());
					// 解析content
					searchVO.setContents(result.xpath(
							"//p[@class='excerpt']/text()").toString());
					// 解析link
					searchVO.setUrl(result.xpath("//h2[@class='h4']/a[1]")
							.links().get());
					results.add(searchVO);

				}
				page.putField(BasePageProcessor.STATIC_NAME_CONTENT,
						results);
			}
		}
	}

}
