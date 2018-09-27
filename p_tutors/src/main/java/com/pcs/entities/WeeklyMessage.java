package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * WeeklyMessage generated by hbm2java
 */
@Entity
@Table(name = "weekly_message", catalog = "ptutors_db")
public class WeeklyMessage implements java.io.Serializable {

	private String message;

	public WeeklyMessage() {
	}

	public WeeklyMessage(String message) {
		this.message = message;
	}

	@Id

	@Column(name = "message", length = 2000)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
