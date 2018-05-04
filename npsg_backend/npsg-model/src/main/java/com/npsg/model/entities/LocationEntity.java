package com.npsg.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class LocationEntity {
	@Id
	@Column(length = 100)
	private String name;
	@OneToOne
	@JoinColumn(name = "idPerson")
	private PersonEntity responsible;
	private int numberOfplaces;
	private int address;
	private String email;
	private int telephonNumber;
	private int comments;

	public String getName() {
		return name;
	}

	public PersonEntity getResponsible() {
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

	public void setResponsible(PersonEntity responsible) {
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
