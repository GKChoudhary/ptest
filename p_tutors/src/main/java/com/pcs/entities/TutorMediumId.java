package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TutorMediumId generated by hbm2java
 */
@Embeddable
public class TutorMediumId implements java.io.Serializable {

	private String tutorId;
	private int mediumId;
	private String otherMediumName;

	public TutorMediumId() {
	}

	public TutorMediumId(String tutorId, int mediumId) {
		this.tutorId = tutorId;
		this.mediumId = mediumId;
	}

	public TutorMediumId(String tutorId, int mediumId, String otherMediumName) {
		this.tutorId = tutorId;
		this.mediumId = mediumId;
		this.otherMediumName = otherMediumName;
	}

	@Column(name = "TUTOR_ID", nullable = false, length = 10)
	public String getTutorId() {
		return this.tutorId;
	}

	public void setTutorId(String tutorId) {
		this.tutorId = tutorId;
	}

	@Column(name = "MEDIUM_ID", nullable = false)
	public int getMediumId() {
		return this.mediumId;
	}

	public void setMediumId(int mediumId) {
		this.mediumId = mediumId;
	}

	@Column(name = "OTHER_MEDIUM_NAME", length = 200)
	public String getOtherMediumName() {
		return this.otherMediumName;
	}

	public void setOtherMediumName(String otherMediumName) {
		this.otherMediumName = otherMediumName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TutorMediumId))
			return false;
		TutorMediumId castOther = (TutorMediumId) other;

		return ((this.getTutorId() == castOther.getTutorId()) || (this.getTutorId() != null
				&& castOther.getTutorId() != null && this.getTutorId().equals(castOther.getTutorId())))
				&& (this.getMediumId() == castOther.getMediumId())
				&& ((this.getOtherMediumName() == castOther.getOtherMediumName())
						|| (this.getOtherMediumName() != null && castOther.getOtherMediumName() != null
								&& this.getOtherMediumName().equals(castOther.getOtherMediumName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTutorId() == null ? 0 : this.getTutorId().hashCode());
		result = 37 * result + this.getMediumId();
		result = 37 * result + (getOtherMediumName() == null ? 0 : this.getOtherMediumName().hashCode());
		return result;
	}

}
