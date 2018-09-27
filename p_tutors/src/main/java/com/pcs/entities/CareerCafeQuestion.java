package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CareerCafeQuestion generated by hbm2java
 */
@Entity
@Table(name = "career_cafe_question", catalog = "ptutors_db")
public class CareerCafeQuestion implements java.io.Serializable {

	private Integer careerQuestionId;
	private Integer careerQuestionPostedBy;
	private String careerQuestion;
	private Date careerQuestionPostedTime;

	public CareerCafeQuestion() {
	}

	public CareerCafeQuestion(Integer careerQuestionPostedBy, String careerQuestion, Date careerQuestionPostedTime) {
		this.careerQuestionPostedBy = careerQuestionPostedBy;
		this.careerQuestion = careerQuestion;
		this.careerQuestionPostedTime = careerQuestionPostedTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "career_question_id", unique = true, nullable = false)
	public Integer getCareerQuestionId() {
		return this.careerQuestionId;
	}

	public void setCareerQuestionId(Integer careerQuestionId) {
		this.careerQuestionId = careerQuestionId;
	}

	@Column(name = "career_question_posted_by")
	public Integer getCareerQuestionPostedBy() {
		return this.careerQuestionPostedBy;
	}

	public void setCareerQuestionPostedBy(Integer careerQuestionPostedBy) {
		this.careerQuestionPostedBy = careerQuestionPostedBy;
	}

	@Column(name = "career_question", length = 500)
	public String getCareerQuestion() {
		return this.careerQuestion;
	}

	public void setCareerQuestion(String careerQuestion) {
		this.careerQuestion = careerQuestion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "career_question_posted_time", length = 19)
	public Date getCareerQuestionPostedTime() {
		return this.careerQuestionPostedTime;
	}

	public void setCareerQuestionPostedTime(Date careerQuestionPostedTime) {
		this.careerQuestionPostedTime = careerQuestionPostedTime;
	}

}
