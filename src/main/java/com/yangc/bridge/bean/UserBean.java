package com.yangc.bridge.bean;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -598500672679808385L;

	private long expireSessionId;
	private String uuid;
	private String username;
	private String password;

	public long getExpireSessionId() {
		return expireSessionId;
	}

	public void setExpireSessionId(long expireSessionId) {
		this.expireSessionId = expireSessionId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
