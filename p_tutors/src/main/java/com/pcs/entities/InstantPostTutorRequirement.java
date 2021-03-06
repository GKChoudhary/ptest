package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InstantPostTutorRequirement generated by hbm2java
 */
@Entity
@Table(name = "instant_post_tutor_requirement", catalog = "ptutors_db")
public class InstantPostTutorRequirement implements java.io.Serializable {

	private String tutionRequirementId;
	private CountryName countryName;
	private LocationName locationName;
	private String contactPerson;
	private String contactNumber;
	private String emailId;
	private String tutionTitle;
	private String subjectTitle;
	private String classStandard;
	private String areaName;
	private Date tutionPostingDate;
	private Boolean tutorSupplyStatus;
	private Boolean profileActiveStatus;

	public InstantPostTutorRequirement() {
	}

	public InstantPostTutorRequirement(String tutionRequirementId) {
		this.tutionRequirementId = tutionRequirementId;
	}

	public InstantPostTutorRequirement(String tutionRequirementId, CountryName countryName, LocationName locationName,
			String contactPerson, String contactNumber, String emailId, String tutionTitle, String subjectTitle,
			String classStandard, String areaName, Date tutionPostingDate, Boolean tutorSupplyStatus,
			Boolean profileActiveStatus) {
		this.tutionRequirementId = tutionRequirementId;
		this.countryName = countryName;
		this.locationName = locationName;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.tutionTitle = tutionTitle;
		this.subjectTitle = subjectTitle;
		this.classStandard = classStandard;
		this.areaName = areaName;
		this.tutionPostingDate = tutionPostingDate;
		this.tutorSupplyStatus = tutorSupplyStatus;
		this.profileActiveStatus = profileActiveStatus;
	}

	@Id

	@Column(name = "TUTION_REQUIREMENT_ID", unique = true, nullable = false, length = 10)
	public String getTutionRequirementId() {
		return this.tutionRequirementId;
	}

	public void setTutionRequirementId(String tutionRequirementId) {
		this.tutionRequirementId = tutionRequirementId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_CODE")
	public CountryName getCountryName() {
		return this.countryName;
	}

	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_ID")
	public LocationName getLocationName() {
		return this.locationName;
	}

	public void setLocationName(LocationName locationName) {
		this.locationName = locationName;
	}

	@Column(name = "CONTACT_PERSON", length = 200)
	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Column(name = "CONTACT_NUMBER", length = 200)
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "EMAIL_ID", length = 200)
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column(name = "TUTION_TITLE", length = 200)
	public String getTutionTitle() {
		return this.tutionTitle;
	}

	public void setTutionTitle(String tutionTitle) {
		this.tutionTitle = tutionTitle;
	}

	@Column(name = "SUBJECT_TITLE", length = 200)
	public String getSubjectTitle() {
		return this.subjectTitle;
	}

	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}

	@Column(name = "CLASS_STANDARD", length = 100)
	public String getClassStandard() {
		return this.classStandard;
	}

	public void setClassStandard(String classStandard) {
		this.classStandard = classStandard;
	}

	@Column(name = "AREA_NAME", length = 200)
	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TUTION_POSTING_DATE", length = 10)
	public Date getTutionPostingDate() {
		return this.tutionPostingDate;
	}

	public void setTutionPostingDate(Date tutionPostingDate) {
		this.tutionPostingDate = tutionPostingDate;
	}

	@Column(name = "TUTOR_SUPPLY_STATUS")
	public Boolean getTutorSupplyStatus() {
		return this.tutorSupplyStatus;
	}

	public void setTutorSupplyStatus(Boolean tutorSupplyStatus) {
		this.tutorSupplyStatus = tutorSupplyStatus;
	}

	@Column(name = "PROFILE_ACTIVE_STATUS")
	public Boolean getProfileActiveStatus() {
		return this.profileActiveStatus;
	}

	public void setProfileActiveStatus(Boolean profileActiveStatus) {
		this.profileActiveStatus = profileActiveStatus;
	}

}
