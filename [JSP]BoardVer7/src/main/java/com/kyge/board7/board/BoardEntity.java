package com.kyge.board7.board;

public class BoardEntity {
	private int iboard;
	public int getIboard() {
		return iboard;
	}
	public void setIboard(int iboard) {
		this.iboard = iboard;
	}
	public int getIuser() {
		return iuser;
	}
	public void setIuser(int iuser) {
		this.iuser = iuser;
	}
	public String getCtnt() {
		return ctnt;
	}
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
	public String getRegdt() {
		return regdt;
	}
	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	private int iuser;
	private String ctnt;
	private String regdt;
	private String title;
	
}
