package com.zhidian.bases.worms.processors;

import java.util.ArrayList;
import java.util.List;

import com.zhidian.bases.worms.pipelines.SegmentFaultSearchPipeline;
import com.zhidian.test.thread.Runa;
import com.zhidian.views.SearchResultVO;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.selector.Selectable;

public class SegmentFaultProcessor extends BasePageProcessor {

	public void process(Page page) {
		Selectable select = page.getHtml().xpath(
				"//section[@class^='widget-question']");
		if (!isCss(page.getUrl())) {
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

	public static void main(String[] args) {
//		Spider.create(new SegmentFaultProcessor())
//				.addPipeline(new SegmentFaultSearchPipeline())
//				.get("https://segmentfault.com/search?q=python");
		SegmentFaultSearchPipeline pipe = new SegmentFaultSearchPipeline();
		Runa runa = new Runa(pipe);
		Runa runa2 = new Runa(pipe);
		Thread t1 = new Thread(runa,"demo1");
		Thread t2 = new Thread(runa2,"demo2");
		t1.start();
		System.out.println("1 ="+pipe.getResults());
		t2.start();
		System.out.println("2 ="+pipe.getResults());
		
	}
}
