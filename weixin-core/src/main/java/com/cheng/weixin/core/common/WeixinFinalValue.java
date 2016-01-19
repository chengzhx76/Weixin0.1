package com.cheng.weixin.core.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WeixinFinalValue {

	@Value("${weixin.token}")
	public String WX_TOKEN;
	@Value("${weixin.appid}")
	public String APPID;
	@Value("${weixin.appsecret}")
	public String APPSECRET;
	
}
