package com.zjut.yout.channel.model;

/**
 * @description 后台用户实体
 * @author yout.linl
 * @date 2009-1-20
 * @version 1.0
 */

public class AdminUser {

	private String adminUserId;

	private String userName;

	private String password;

	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
}
