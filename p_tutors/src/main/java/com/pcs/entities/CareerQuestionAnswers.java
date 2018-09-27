package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CareerQuestionAnswers generated by hbm2java
 */
@Entity
@Table(name = "career_question_answers", catalog = "ptutors_db")
public class CareerQuestionAnswers implements java.io.Serializable {

	private CareerQuestionAnswersId id;

	public CareerQuestionAnswers() {
	}

	public CareerQuestionAnswers(CareerQuestionAnswersId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "careerQuestionId", column = @Column(name = "career_question_id")),
			@AttributeOverride(name = "careerQuestionAnswer", column = @Column(name = "career_question_answer", length = 500)),
			@AttributeOverride(name = "careerQuestionRepliedBy", column = @Column(name = "career_question_replied_by")),
			@AttributeOverride(name = "careerQuestionRepliedTime", column = @Column(name = "career_question_replied_time", length = 19)) })
	public CareerQuestionAnswersId getId() {
		return this.id;
	}

	public void setId(CareerQuestionAnswersId id) {
		this.id = id;
	}

}