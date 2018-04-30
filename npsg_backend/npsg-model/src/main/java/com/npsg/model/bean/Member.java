package com.npsg.model.bean;

public class Member extends Person {

	private int cardNumber;
	private String type;// attivo , onorario, fondatore...
	private boolean inscribed;
	private String registrationDate;

	public Member() {
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
