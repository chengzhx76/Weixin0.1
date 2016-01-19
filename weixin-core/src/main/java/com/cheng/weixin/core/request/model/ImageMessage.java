package com.cheng.weixin.core.request.model;

/**
 * 图片消息
 * @author Cheng
 */
public class ImageMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private Image Image;
	
	public Image getImage() {
		return Image;
	}
	public void setImage(Image image) {
		this.Image = image;
	}
	
}
