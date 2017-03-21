
/**
* @Title: CommonSpiderConfigs.java
* @Package com.zhidian.configs
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午5:47:32
* @version V1.0
*/
package com.zhidian.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CommonSpiderConfigs
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午5:47:32
 *
 */
@Component
public class CommonSpiderConfigs {
	
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

	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param userAgent the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * @return the timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return the charset
	 */
	public String getCharset() {
		return charset;
	}

	/**
	 * @param charset the charset to set
	 */
	public void setCharset(String charset) {
		this.charset = charset;
	}

	/**
	 * @return the sleepTime
	 */
	public int getSleepTime() {
		return sleepTime;
	}

	/**
	 * @param sleepTime the sleepTime to set
	 */
	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	/**
	 * @return the cycleTime
	 */
	public int getCycleTime() {
		return cycleTime;
	}

	/**
	 * @param cycleTime the cycleTime to set
	 */
	public void setCycleTime(int cycleTime) {
		this.cycleTime = cycleTime;
	}

	/**
	 * @return the useGzip
	 */
	public boolean isUseGzip() {
		return useGzip;
	}

	/**
	 * @param useGzip the useGzip to set
	 */
	public void setUseGzip(boolean useGzip) {
		this.useGzip = useGzip;
	}
}
