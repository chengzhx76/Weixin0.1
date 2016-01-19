package com.cheng.weixin.core.request.model;

/**
 * 语音消息
 * @author Cheng
 */
public class VoiceMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private Voice Voice;
	
	public Voice getVoice() {
		return Voice;
	}
	public void setVoice(Voice voice) {
		this.Voice = voice;
	}
}
