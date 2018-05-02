package com.npsg.model.bean;

public class Location {

	private String name;
	private Person responsible;
	private int numberOfplaces;
	private int address;
	private String email;
	private int telephonNumber;
	private int comments;

	public String getName() {
		return name;
	}

	public Person getResponsible() {
		return responsible;
	}

	public int getNumberOfplaces() {
		return numberOfplaces;
	}

	public int getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public int getTelephonNumber() {
		return telephonNumber;
	}

	public int getComments() {
		return comments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResponsible(Person responsible) {
		this.responsible = responsible;
	}

	public void setNumberOfplaces(int numberOfplaces) {
		this.numberOfplaces = numberOfplaces;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephonNumber(int telephonNumber) {
		this.telephonNumber = telephonNumber;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

}
