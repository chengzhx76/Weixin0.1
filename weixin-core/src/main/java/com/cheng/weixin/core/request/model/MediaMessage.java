package com.cheng.weixin.core.request.model;

/**
 * 语音消息
 * @author Cheng
 */
public class MediaMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private Media Media;
	
	public Media getMedia() {
		return Media;
	}
	public void setMedia(Media media) {
		this.Media = media;
	}
	
}
