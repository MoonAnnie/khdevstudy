package com.kh.board;

import java.sql.Timestamp;

public class BoardVo {
	
	//DB 테이블 칼럼들 필드로 작성
	
	//제목, 내용, 작성자(번호), 작성시각, 삭제여부, 수정시각 (디비 모델링 한 칼럼명들로 쓰기)
	
	//기본 생성자
	public BoardVo() {
		
	}
	
	//매개변수 있는 생성자
	public BoardVo(int no, String title, String content, String writer, Timestamp enrollDate, Timestamp modifyDate,
			String status) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}
	
	private int no;
	private String title;
	private String content;
	private String writer; //작성자 번호로 닉네임 가져올 거라 String 으로 함
	private Timestamp enrollDate;
	private Timestamp modifyDate;
	private String status;

	//getter, setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	//toString
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", enrollDate=" + enrollDate + ", modifyDate=" + modifyDate + ", status=" + status + "]";
	}


}