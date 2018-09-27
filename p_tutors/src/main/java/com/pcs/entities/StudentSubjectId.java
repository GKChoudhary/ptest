package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * StudentSubjectId generated by hbm2java
 */
@Embeddable
public class StudentSubjectId implements java.io.Serializable {

	private String studentId;
	private Integer subjectId;
	private String otherSubjectName;

	public StudentSubjectId() {
	}

	public StudentSubjectId(String studentId, Integer subjectId, String otherSubjectName) {
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.otherSubjectName = otherSubjectName;
	}

	@Column(name = "STUDENT_ID", length = 10)
	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Column(name = "SUBJECT_ID")
	public Integer getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "OTHER_SUBJECT_NAME", length = 200)
	public String getOtherSubjectName() {
		return this.otherSubjectName;
	}

	public void setOtherSubjectName(String otherSubjectName) {
		this.otherSubjectName = otherSubjectName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentSubjectId))
			return false;
		StudentSubjectId castOther = (StudentSubjectId) other;

		return ((this.getStudentId() == castOther.getStudentId()) || (this.getStudentId() != null
				&& castOther.getStudentId() != null && this.getStudentId().equals(castOther.getStudentId())))
				&& ((this.getSubjectId() == castOther.getSubjectId()) || (this.getSubjectId() != null
						&& castOther.getSubjectId() != null && this.getSubjectId().equals(castOther.getSubjectId())))
				&& ((this.getOtherSubjectName() == castOther.getOtherSubjectName())
						|| (this.getOtherSubjectName() != null && castOther.getOtherSubjectName() != null
								&& this.getOtherSubjectName().equals(castOther.getOtherSubjectName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getStudentId() == null ? 0 : this.getStudentId().hashCode());
		result = 37 * result + (getSubjectId() == null ? 0 : this.getSubjectId().hashCode());
		result = 37 * result + (getOtherSubjectName() == null ? 0 : this.getOtherSubjectName().hashCode());
		return result;
	}

}