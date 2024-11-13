package com.scb.FirstScbSpringBootEnvProfiles.entitybean;

public class MyDataResource {
	private String userName;
	private String password;

	public MyDataResource() {
		super();

	}

	public MyDataResource(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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

	@Override
	public String toString() {
		return "MyDataResource [userName=" + userName + ", password=" + password + "]";
	}

}
