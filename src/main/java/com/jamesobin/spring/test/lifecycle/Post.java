package com.jamesobin.spring.test.lifecycle;

public class Post {

	// 멤버변수 뭐로 할지 고민
	// 제복, 사용자, 내용
	private String title;
	private String user;
	private String content;
	
	public Post(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}

	public String getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}
	
	
	
}
