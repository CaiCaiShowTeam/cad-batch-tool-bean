package com.bplead.cad.bean.client;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import priv.lee.cad.model.ServerClientTemporary;

@JacksonXmlRootElement(localName = "temporary")
public class Temporary implements ServerClientTemporary {

	private static final long serialVersionUID = 6958216530554295242L;
	private boolean rememberMe;
	private String server;
	private String userName;
	private String userPasswd;

	public Temporary() {

	}

	public Temporary(String server, String userName, String userPasswd, boolean rememberMe) {
		this.server = server;
		this.userName = userName;
		this.userPasswd = userPasswd;
		this.rememberMe = rememberMe;
	}

	@Override
	public String getServer() {
		return server;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getUserPasswd() {
		return userPasswd;
	}

	@Override
	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}
}
