package com.cheng.weixin.core.request.model;

/**
 * 音乐消息
 * @author Cheng
 */
public class MusicMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private WxMusic Music;
	
	public WxMusic getMusic() {
		return Music;
	}
	public void setMusic(WxMusic music) {
		this.Music = music;
	}
}
