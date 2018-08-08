package com.blog.studysomething.board.service;

import java.util.Date;

public class BoardVO {
	private String bbsID;
	private String title;
	private String writer;
	private String content;
	private Date date;
	private int readCount;
	private String filePath;
	
	public String getBbsID() {
		return bbsID;
	}
	public void setBbsID(String bbsID) {
		this.bbsID = bbsID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
