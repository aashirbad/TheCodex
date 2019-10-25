/*
 * This class is a bean class of User Log In 
 * 
 * 
 */
package com.CODEX.Bean;
public class UserLogBean {
	private int userId;
	private String UserPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int uId) {
		this.userId = uId;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

}
