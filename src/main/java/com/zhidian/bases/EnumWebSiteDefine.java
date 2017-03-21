package com.zhidian.bases;

import com.zhidian.bases.worms.pipelines.SegmentFaultPagePipeline;
import com.zhidian.bases.worms.processors.SegmentFaultPageProcessor;

public enum EnumWebSiteDefine {
	github(null,null,null), segementfault("https://segmentfault.com/search?q=",SegmentFaultPageProcessor.class,SegmentFaultPagePipeline.class);

	private String url;
	private Class<?> processor;
	private Class<?> pipeline;

	private EnumWebSiteDefine(String url,Class<?> processor,Class<?> pipeline) {
		this.url = url;
		this.processor = processor;
		this.pipeline = pipeline;
	}

	public String getUrl() {
		return url;
	}
	
	public Class<?> getProcessor(){
		return processor;
	}
	
	public Class<?> getPipeline(){
		return pipeline;
	}
	
}
