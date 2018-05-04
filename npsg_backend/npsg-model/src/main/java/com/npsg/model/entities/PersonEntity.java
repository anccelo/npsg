package com.npsg.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
/* https://blog.axopen.com/2014/03/hibernate-4-heritage-mapping-strategies/
 * spunti per cercare di risolvere l'ereditartità tre entità
 * */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonEntity {

	@Id
	@SequenceGenerator(name = "seq", sequenceName = "person_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private int idPerson;
	private String name;
	private String surname;
	private String email;
	private String phoneNumber1;
	private String phoneNumber2;
	// for the moment I want to be simpler and more possible and I don't want use
	// "Date"
	private String birthDate;
	private String birthPlace;
	private String domicile;
	private String comments;

	public PersonEntity() {
	}

	public int getIdPerson() {
		return idPerson;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
