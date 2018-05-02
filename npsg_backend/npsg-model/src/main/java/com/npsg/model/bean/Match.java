package com.npsg.model.bean;

public class Match {

	private int Id;
	private String opponents;
	private boolean inHome;
	private String date;

	public int getId() {
		return Id;
	}

	public String getOpponents() {
		return opponents;
	}

	public boolean isInHome() {
		return inHome;
	}

	public String getDate() {
		return date;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setOpponents(String opponents) {
		this.opponents = opponents;
	}

	public void setInHome(boolean inHome) {
		this.inHome = inHome;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
