package com.npsg.model.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "idPerson")
public class MemberEntity extends PersonEntity {

	private int cardNumber;
	private String type;// attivo , onorario, fondatore...
	private boolean inscribed;
	private String registrationDate;

	public MemberEntity() {
		super();
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public String getType() {
		return type;
	}

	public boolean isInscribed() {
		return inscribed;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setInscribed(boolean inscribed) {
		this.inscribed = inscribed;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

}
