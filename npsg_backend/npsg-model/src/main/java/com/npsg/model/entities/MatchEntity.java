package com.npsg.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class MatchEntity {
	@Id
	@SequenceGenerator(name = "seqMatch", sequenceName = "seq_match")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMatch")
	private int Id;
	private String opponents;
	private boolean inHome;
	private String date;
	private String comment;

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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
