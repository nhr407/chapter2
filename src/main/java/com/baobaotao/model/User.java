package com.baobaotao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
public class User implements Serializable {
	private Integer userId;  // pk
	private String userName; // 用户名
	private String password; // 密码
	private Integer credits; // 积分
	private String lastIp;    // 最后一次登录IP
	private Date lastVisit;   // 最后一次登录时间
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
}
