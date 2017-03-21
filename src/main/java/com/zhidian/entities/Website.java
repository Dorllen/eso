
/**
* @Title: Website.java
* @Package com.zhidian.entities
* @Description: TODO(用一句话描述该文件做什么)
* @author dongneng
* @date 2017-3-21 上午1:46:57
* @version V1.0
*/
package com.zhidian.entities;

import java.util.Date;

/**
 * @ClassName: Website
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dongneng
 * @date 2017-3-21 上午1:46:57
 *
 */
public class Website {
	private int id;
	private String name;
	private String shortAddr;
	private String fullAddr;
	private Date createTime;
	private String createMan;
	private Date updateTime;
	private String updateMan;
	private String descri;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the shortAddr
	 */
	public String getShortAddr() {
		return shortAddr;
	}
	/**
	 * @param shortAddr the shortAddr to set
	 */
	public void setShortAddr(String shortAddr) {
		this.shortAddr = shortAddr;
	}
	/**
	 * @return the fullAddr
	 */
	public String getFullAddr() {
		return fullAddr;
	}
	/**
	 * @param fullAddr the fullAddr to set
	 */
	public void setFullAddr(String fullAddr) {
		this.fullAddr = fullAddr;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the createMan
	 */
	public String getCreateMan() {
		return createMan;
	}
	/**
	 * @param createMan the createMan to set
	 */
	public void setCreateMan(String createMan) {
		this.createMan = createMan;
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
	 * @return the descri
	 */
	public String getDescri() {
		return descri;
	}
	/**
	 * @param descri the descri to set
	 */
	public void setDescri(String descri) {
		this.descri = descri;
	}
	
	
}
