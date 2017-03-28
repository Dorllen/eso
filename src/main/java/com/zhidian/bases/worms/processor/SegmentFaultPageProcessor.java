
/**
* @Title: SegmentFaultPageProcessor.java
* @Package com.zhidian.bases.worms.processors
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午12:42:15
* @version V1.0
*/
package com.zhidian.bases.worms.processor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import com.zhidian.views.SearchResultVO;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
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
		if(isCss(page.getUrl().toString())){
			// 加入 css 解决器中..
			System.out.println("PageProcessor："+page.getUrl().toString());
		}else{
			// 加入搜索结果entity中
			Selectable select = page.getHtml().$("div.wrap");
			System.out.println("infor:"+select.get());
			// 将css放入request
			System.out.println("One:"+page.getHtml().regex("<link\\s*rel='stylesheet'\\s*href='(.*)'\\s*>").toString());
			List<String> cssPaths = page.getHtml().regex("<link\\s*rel='stylesheet'\\s*href='(.*)'\\s*>").all();
			System.out.println("cssPaths:"+cssPaths);
			if(cssPaths!=null&&cssPaths.size()>0){
				for(String css : cssPaths){
					System.out.println("path:"+css);
				}
				page.addTargetRequests(cssPaths);
			}
		}
	}
	public static void main(String[] args) {
		Spider.create(new SegmentFaultPageProcessor()).addUrl("http://segmentfault.com/q/1010000003713912").addPipeline(new ConsolePipeline()).thread(2).start();
	}
}
