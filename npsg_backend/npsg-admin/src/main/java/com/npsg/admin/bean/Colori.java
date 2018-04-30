package com.npsg.admin.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Colori {

	@Id
	private String color;

	public Colori() {
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

}
