package com.cheng.weixin.message;

import com.cheng.weixin.core.enums.MsgType;
import com.cheng.weixin.core.request.model.*;
import com.cheng.weixin.core.utils.XMLUtils;
import org.junit.Test;

import java.util.Date;

public class MsgToXML {
//	@Test
	public void textMsg2XML() {
		TextMessage text = new TextMessage();
		text.setToUserName("chengzhx76");
		text.setFromUserName("cheng");
		text.setCreateTime(new Date().getTime());
		text.setContent("hello!");
		text.setMsgType(MsgType.text);

		System.out.println(XMLUtils.msg2XML(text));
	}

	@Test
	public void voiceMsg2XML() {
		VoiceMessage voiceMsg = new VoiceMessage();
		voiceMsg.setToUserName("chengzhx76");
		voiceMsg.setFromUserName("cheng");
		voiceMsg.setCreateTime(new Date().getTime());
		voiceMsg.setMsgType(MsgType.voice);
		WxVoice voice = new WxVoice();
		voice.setMediaId("523646324131");
		voiceMsg.setVoice(voice);

		System.out.println(XMLUtils.msg2XML(voiceMsg));
	}
	@Test
	public void imageTypeMsgHandle() {
		ImageMessage imgMsg = new ImageMessage();
		imgMsg.setToUserName("chengzhx76");
		imgMsg.setFromUserName("cheng");
		imgMsg.setCreateTime(new Date().getTime());
		imgMsg.setMsgType(MsgType.image);

		WxImage img = new WxImage();
		String mediaId = "M8K2WcayqjRaisQMCygVpWk1VDAjL8XMhvB66Y5TpBHsopHViOEOIR4semy9oOAD";
		img.setMediaId(mediaId);
		imgMsg.setImage(img);

		System.out.println(XMLUtils.msg2XML(imgMsg));
	}
}
