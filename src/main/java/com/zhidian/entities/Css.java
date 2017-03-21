/**
 * @Title: Css.java
 * @Package com.zhidian.entities
 * @Description: TODO(用一句话描述该文件做什么)
 * @author dongneng
 * @date 2017-3-21 上午1:13:08
 * @version V1.0
 */
package com.zhidian.entities;

import java.util.Date;

/**
 * @ClassName: Css
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午1:13:08
 * 
 */
public class Css {
	private int id;
	private String website;
	private String version;
	private String path;
	private int using;
	private Date createTime;
	private String descri;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website
	 *            the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the using
	 */
	public int getUsing() {
		return using;
	}

	/**
	 * @param using
	 *            the using to set
	 */
	public void setUsing(int using) {
		this.using = using;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the descri
	 */
	public String getDescri() {
		return descri;
	}

	/**
	 * @param descri
	 *            the descri to set
	 */
	public void setDescri(String descri) {
		this.descri = descri;
	}
}
