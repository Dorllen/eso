package com.zhidian.model;

public class PullDataTaskModel {
	private String website;// 站点名称
	private Class<?> pageProcess; // 处理对象
	private Class<?> pipeLine;// 接收对象
	private String searchOriginUrl;

	public PullDataTaskModel() {
	}

	public PullDataTaskModel(String website, Class<?> pageProcess, Class<?> pipeLine, String searchOriginUrl) {
		this.website = website;
		this.pageProcess = pageProcess;
		this.pipeLine = pipeLine;
		this.searchOriginUrl = searchOriginUrl;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Class<?> getPageProcess() {
		return pageProcess;
	}

	public void setPageProcess(Class<?> pageProcess) {
		this.pageProcess = pageProcess;
	}

	public Class<?> getPipeLine() {
		return pipeLine;
	}

	public void setPipeLine(Class<?> pipeLine) {
		this.pipeLine = pipeLine;
	}

	public String getSearchOriginUrl() {
		return searchOriginUrl;
	}

	public void setSearchOriginUrl(String searchOriginUrl) {
		this.searchOriginUrl = searchOriginUrl;
	}

}
