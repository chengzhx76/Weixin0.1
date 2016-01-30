package com.cheng.weixin.core.request.model;

import java.io.Serializable;

public class WxMedia implements Serializable {
	private static final long serialVersionUID = 1L;
	private String MediaId;
	private String Title;// 非必须
	private String Description;// 非必须

	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
