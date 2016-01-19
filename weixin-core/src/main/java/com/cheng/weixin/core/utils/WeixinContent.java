package com.cheng.weixin.core.utils;

public class WeixinContent {
	
	private WeixinContent(){}
	
	private static class SingletonHolder {
		public static final WeixinContent instance = new WeixinContent();
	}
	
	public static WeixinContent getInstance() {
		return SingletonHolder.instance;
	}
	
//	private String accessToken;
	private static String accessToken = "vHgojVWqN5I_1tZ9PB5D9oz2YYfBnND6b1HeI6AqDpwGIzpj3ns3FviL44OyFyypom20nLa2-jpCX-Miv0qTT87waO5PTPQbQPjmEkmVnwEFJDjAHAZDX";
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
