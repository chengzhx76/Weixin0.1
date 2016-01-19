package com.cheng.weixin.core.request.model;

/**
 * 音乐消息
 * @author Cheng
 */
public class MusicMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private Music Music;
	
	public Music getMusic() {
		return Music;
	}
	public void setMusic(Music music) {
		this.Music = music;
	}
}
