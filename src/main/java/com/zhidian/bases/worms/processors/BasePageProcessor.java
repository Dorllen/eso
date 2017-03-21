/**
 * @Title: AbstractProcessor.java
 * @Package com.zhidian.bases.worms.processors
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-21 上午12:06:48
 * @version V1.0
 */
package com.zhidian.bases.worms.processors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @ClassName: AbstractProcessor
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午12:06:48
 * 
 */
public abstract class BasePageProcessor implements PageProcessor {
	public final static String STATIC_NAME_CONTENT = "STATIC_CONTENTS_CODE";
	public final static String STATIC_NAME_CSS = "STATIC_CSS_CODE";


	@Value("${cookies.settings.userAgent}")
	private String userAgent;

	@Value("${cookies.settings.timeout}")
	private int timeout;

	@Value("${cookies.settings.charset}")
	private String charset;

	@Value("${cookies.settings.sleepTime}")
	private int sleepTime;

	@Value("${cookies.settings.cycleTime}")
	private int cycleTime;

	@Value("${cookies.settings.useGzip}")
	private boolean useGzip;

	@Override
	public Site getSite() {
		return Site.me().setUserAgent(userAgent).setCharset(charset)
				.setCycleRetryTimes(cycleTime).setSleepTime(sleepTime)
				.setTimeOut(timeout).setUseGzip(useGzip);
	}

	public boolean isCss(Object url) {
		Pattern pattern = Pattern.compile("^.*\\.css.*$");
		Matcher matcher = pattern.matcher(url.toString());
		return matcher.matches();
	}
}
