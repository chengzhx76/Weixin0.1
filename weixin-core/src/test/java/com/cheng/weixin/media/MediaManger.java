package com.cheng.weixin.media;

import com.alibaba.fastjson.JSON;
import com.cheng.weixin.core.common.WeixinUrl;
import com.cheng.weixin.core.enums.MidiaType;
import com.cheng.weixin.core.exception.BusinessException;
import com.cheng.weixin.core.response.model.Media;
import com.cheng.weixin.core.utils.HttpUtils;
import com.cheng.weixin.core.utils.WeixinContent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class MediaManger {
	private static final Logger log = LoggerFactory.getLogger(MediaManger.class);
	@Resource
	protected WeixinUrl weixinUrl;
	@Test
	public void addTempMidia() {
		String url = weixinUrl.ADD_TEMPMEDIA_URL;
		url = url.replace("ACCESS_TOKEN", WeixinContent.getInstance().getAccessToken()).replace("TYPE", MidiaType.image.name());

		try {
			String content = HttpUtils.postMedia(url, "C:\\Picture\\g.jpg");
			Media media = JSON.parseObject(content, Media.class);
			System.out.println(media);
		} catch (BusinessException err) {
			log.error("发生错误，错误码：{}，错误消息：{}", err.getCode(), err.getErrorMsg());
		}
	}
	@Test
	public void getMedie() {
		String url = weixinUrl.GET_MEDIA_URL;
		String mediaId = "M8K2WcayqjRaisQMCygVpWk1VDAjL8XMhvB66Y5TpBHsopHViOEOIR4semy9oOAD";
		url = url.replace("ACCESS_TOKEN", WeixinContent.getInstance().getAccessToken()).replace("MEDIA_ID", mediaId);
		try {
			HttpUtils.getMidie(url, "D:\\1.jpg");
		} catch (BusinessException err) {
//			e.printStackTrace();
			log.error("发生错误，错误码：{}，错误消息：{}", err.getCode(), err.getErrorMsg());
		}

	}

}
