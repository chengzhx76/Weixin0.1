package com.cheng.weixin.core.request.model;
/**
 * 文本消息
 * @author Cheng
 */
public class TextMessage extends BaseMessage {
	private static final long serialVersionUID = 1L;
	private String Content;

	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
}
