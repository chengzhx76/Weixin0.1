package com.cheng.weixin.core.request.model;

/**
 * 语音消息
 * @author Cheng
 */
public class MediaMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private WxMedia Media;
	
	public WxMedia getMedia() {
		return Media;
	}
	public void setMedia(WxMedia media) {
		this.Media = media;
	}
	
}
