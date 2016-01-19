package com.cheng.weixin.core.request.model;

import java.util.List;

/**
 * 图文消息
 * @author Cheng
 */
public class NewsMessage extends BaseMessage {
	
	private static final long serialVersionUID = 1L;
	private List<News> Articles;
	
	public List<News> getArticles() {
		return Articles;
	}
	public void setArticles(List<News> articles) {
		this.Articles = articles;
	}
}
