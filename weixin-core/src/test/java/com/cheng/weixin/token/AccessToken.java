package com.cheng.weixin.token;

import com.cheng.weixin.core.common.WeixinFinalValue;
import com.cheng.weixin.core.common.WeixinUrl;
import com.cheng.weixin.core.utils.HttpUtils;
import com.cheng.weixin.core.utils.WeixinContent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class AccessToken {

	@Resource
	protected WeixinUrl weixinUrl;
	@Resource
	protected WeixinFinalValue weixinFinalValue;

	@Test
	public void token() {
		String url = weixinUrl.ACCESS_TOKEN_URL;
		url = url.replace("APPID", weixinFinalValue.APPID).replaceAll("APPSECRET", weixinFinalValue.APPSECRET);
		String content = HttpUtils.httpGet(url);
		System.out.println(content);
	}
	@Test
	public void getToken() {
		System.out.println(WeixinContent.getInstance().getAccessToken());
	}
	
}
