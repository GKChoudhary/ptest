package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * StudentSubject generated by hbm2java
 */
@Entity
@Table(name = "student_subject", catalog = "ptutors_db")
public class StudentSubject implements java.io.Serializable {

	private StudentSubjectId id;

	public StudentSubject() {
	}

	public StudentSubject(StudentSubjectId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "studentId", column = @Column(name = "STUDENT_ID", length = 10)),
			@AttributeOverride(name = "subjectId", column = @Column(name = "SUBJECT_ID")),
			@AttributeOverride(name = "otherSubjectName", column = @Column(name = "OTHER_SUBJECT_NAME", length = 200)) })
	public StudentSubjectId getId() {
		return this.id;
	}

	public void setId(StudentSubjectId id) {
		this.id = id;
	}

}
