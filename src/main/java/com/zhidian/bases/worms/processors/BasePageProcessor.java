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

	private String userAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv/:51.0) Gecko/20100101 Firefox/51.0";

	private int timeout = 3000;

	private String charset = "UTF-8";

	private int sleepTime = 2000;

	private int cycleTime = 0;

	private boolean useGzip = false;

	@Override
	public Site getSite() {
		return Site.me().setUserAgent(userAgent).setCharset(charset).setCycleRetryTimes(cycleTime)
				.setSleepTime(sleepTime).setTimeOut(timeout).setUseGzip(useGzip);
	}

	public boolean isCss(Object url) {
		Pattern pattern = Pattern.compile("^.*\\.css.*$");
		Matcher matcher = pattern.matcher(url.toString());
		return matcher.matches();
	}
}
