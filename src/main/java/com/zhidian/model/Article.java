
/**
* @Title: Ariticle.java
* @Package com.zhidian.mappers
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-20 下午9:54:03
* @version V1.0
*/
package com.zhidian.model;

import java.util.Date;

/**
 * @ClassName: Ariticle
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-20 下午9:54:03
 *
 */
public class Article {
	
	private int id;
	private String uuid;
	private String tags;
	private String title;
	private String contents;
	private String cssVersion;
	private String cssPath;
	private String website;
	private String sign;
	private Date startTime;
	private Date updateTime;
	private String updateMan;
	private Date updateManTime;
	private int using;
	private int views;
	private int scores;
	private int collets;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}
	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the contents
	 */
	public String getContents() {
		return contents;
	}
	/**
	 * @param contents the contents to set
	 */
	public void setContents(String contents) {
		this.contents = contents;
	}
	/**
	 * @return the cssVersion
	 */
	public String getCssVersion() {
		return cssVersion;
	}
	/**
	 * @param cssVersion the cssVersion to set
	 */
	public void setCssVersion(String cssVersion) {
		this.cssVersion = cssVersion;
	}
	/**
	 * @return the cssPath
	 */
	public String getCssPath() {
		return cssPath;
	}
	/**
	 * @param cssPath the cssPath to set
	 */
	public void setCssPath(String cssPath) {
		this.cssPath = cssPath;
	}
	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}
	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the updateMan
	 */
	public String getUpdateMan() {
		return updateMan;
	}
	/**
	 * @param updateMan the updateMan to set
	 */
	public void setUpdateMan(String updateMan) {
		this.updateMan = updateMan;
	}
	/**
	 * @return the updateManTime
	 */
	public Date getUpdateManTime() {
		return updateManTime;
	}
	/**
	 * @param updateManTime the updateManTime to set
	 */
	public void setUpdateManTime(Date updateManTime) {
		this.updateManTime = updateManTime;
	}
	/**
	 * @return the using
	 */
	public int getUsing() {
		return using;
	}
	/**
	 * @param using the using to set
	 */
	public void setUsing(int using) {
		this.using = using;
	}
	/**
	 * @return the views
	 */
	public int getViews() {
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}
	/**
	 * @return the scores
	 */
	public int getScores() {
		return scores;
	}
	/**
	 * @param scores the scores to set
	 */
	public void setScores(int scores) {
		this.scores = scores;
	}
	/**
	 * @return the collets
	 */
	public int getCollets() {
		return collets;
	}
	/**
	 * @param collets the collets to set
	 */
	public void setCollets(int collets) {
		this.collets = collets;
	}
	/* (非 Javadoc)
	* <p>Title: toString</p>
	* <p>Description: </p>
	* @return
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "Article [id=" + id + ", uuid=" + uuid + ", tags=" + tags
				+ ", title=" + title + ", contents=" + contents
				+ ", cssVersion=" + cssVersion + ", cssPath=" + cssPath
				+ ", website=" + website + ", sign=" + sign + ", startTime="
				+ startTime + ", updateTime=" + updateTime + ", updateMan="
				+ updateMan + ", updateManTime=" + updateManTime + ", using="
				+ using + ", views=" + views + ", scores=" + scores
				+ ", collets=" + collets + "]";
	}
	
}
