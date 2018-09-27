package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CountryName generated by hbm2java
 */
@Entity
@Table(name = "country_name", catalog = "ptutors_db")
public class CountryName implements java.io.Serializable {

	private String countryCode;
	private String countryName;
	private String countryShortName;
	private String countryNationalFlag;
	private Set<StudentDetails> studentDetailses = new HashSet<StudentDetails>(0);
	private Set<InstantPostTutorRequirement> instantPostTutorRequirements = new HashSet<InstantPostTutorRequirement>(0);
	private Set<LocationName> locationNames = new HashSet<LocationName>(0);
	private Set<TutorDetails> tutorDetailses = new HashSet<TutorDetails>(0);
	private Set<TutorialCenter> tutorialCenters = new HashSet<TutorialCenter>(0);
	private Set<SchoolBoard> schoolBoards = new HashSet<SchoolBoard>(0);
	private Set<UniversityInstitute> universityInstitutes = new HashSet<UniversityInstitute>(0);

	public CountryName() {
	}

	public CountryName(String countryCode, String countryName, String countryShortName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryShortName = countryShortName;
	}

	public CountryName(String countryCode, String countryName, String countryShortName, String countryNationalFlag,
			Set<StudentDetails> studentDetailses, Set<InstantPostTutorRequirement> instantPostTutorRequirements,
			Set<LocationName> locationNames, Set<TutorDetails> tutorDetailses, Set<TutorialCenter> tutorialCenters,
			Set<SchoolBoard> schoolBoards, Set<UniversityInstitute> universityInstitutes) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.countryShortName = countryShortName;
		this.countryNationalFlag = countryNationalFlag;
		this.studentDetailses = studentDetailses;
		this.instantPostTutorRequirements = instantPostTutorRequirements;
		this.locationNames = locationNames;
		this.tutorDetailses = tutorDetailses;
		this.tutorialCenters = tutorialCenters;
		this.schoolBoards = schoolBoards;
		this.universityInstitutes = universityInstitutes;
	}

	@Id

	@Column(name = "COUNTRY_CODE", unique = true, nullable = false, length = 4)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Column(name = "COUNTRY_NAME", nullable = false, length = 200)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Column(name = "COUNTRY_SHORT_NAME", nullable = false, length = 200)
	public String getCountryShortName() {
		return this.countryShortName;
	}

	public void setCountryShortName(String countryShortName) {
		this.countryShortName = countryShortName;
	}

	@Column(name = "COUNTRY_NATIONAL_FLAG", length = 100)
	public String getCountryNationalFlag() {
		return this.countryNationalFlag;
	}

	public void setCountryNationalFlag(String countryNationalFlag) {
		this.countryNationalFlag = countryNationalFlag;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<StudentDetails> getStudentDetailses() {
		return this.studentDetailses;
	}

	public void setStudentDetailses(Set<StudentDetails> studentDetailses) {
		this.studentDetailses = studentDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<InstantPostTutorRequirement> getInstantPostTutorRequirements() {
		return this.instantPostTutorRequirements;
	}

	public void setInstantPostTutorRequirements(Set<InstantPostTutorRequirement> instantPostTutorRequirements) {
		this.instantPostTutorRequirements = instantPostTutorRequirements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<LocationName> getLocationNames() {
		return this.locationNames;
	}

	public void setLocationNames(Set<LocationName> locationNames) {
		this.locationNames = locationNames;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<TutorDetails> getTutorDetailses() {
		return this.tutorDetailses;
	}

	public void setTutorDetailses(Set<TutorDetails> tutorDetailses) {
		this.tutorDetailses = tutorDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<TutorialCenter> getTutorialCenters() {
		return this.tutorialCenters;
	}

	public void setTutorialCenters(Set<TutorialCenter> tutorialCenters) {
		this.tutorialCenters = tutorialCenters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<SchoolBoard> getSchoolBoards() {
		return this.schoolBoards;
	}

	public void setSchoolBoards(Set<SchoolBoard> schoolBoards) {
		this.schoolBoards = schoolBoards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countryName")
	public Set<UniversityInstitute> getUniversityInstitutes() {
		return this.universityInstitutes;
	}

	public void setUniversityInstitutes(Set<UniversityInstitute> universityInstitutes) {
		this.universityInstitutes = universityInstitutes;
	}

}
