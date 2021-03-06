package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LocationName generated by hbm2java
 */
@Entity
@Table(name = "location_name", catalog = "ptutors_db")
public class LocationName implements java.io.Serializable {

	private Integer locationId;
	private CountryName countryName;
	private String locationName;
	private Set<TutorialCenter> tutorialCenters = new HashSet<TutorialCenter>(0);
	private Set<StudentDetails> studentDetailses = new HashSet<StudentDetails>(0);
	private Set<InstantPostTutorRequirement> instantPostTutorRequirements = new HashSet<InstantPostTutorRequirement>(0);
	private Set<SchoolBoard> schoolBoards = new HashSet<SchoolBoard>(0);
	private Set<TutorDetails> tutorDetailses = new HashSet<TutorDetails>(0);
	private Set<UniversityInstitute> universityInstitutes = new HashSet<UniversityInstitute>(0);

	public LocationName() {
	}

	public LocationName(CountryName countryName, String locationName, Set<TutorialCenter> tutorialCenters,
			Set<StudentDetails> studentDetailses, Set<InstantPostTutorRequirement> instantPostTutorRequirements,
			Set<SchoolBoard> schoolBoards, Set<TutorDetails> tutorDetailses,
			Set<UniversityInstitute> universityInstitutes) {
		this.countryName = countryName;
		this.locationName = locationName;
		this.tutorialCenters = tutorialCenters;
		this.studentDetailses = studentDetailses;
		this.instantPostTutorRequirements = instantPostTutorRequirements;
		this.schoolBoards = schoolBoards;
		this.tutorDetailses = tutorDetailses;
		this.universityInstitutes = universityInstitutes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "LOCATION_ID", unique = true, nullable = false)
	public Integer getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_CODE")
	public CountryName getCountryName() {
		return this.countryName;
	}

	public void setCountryName(CountryName countryName) {
		this.countryName = countryName;
	}

	@Column(name = "LOCATION_NAME", length = 200)
	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<TutorialCenter> getTutorialCenters() {
		return this.tutorialCenters;
	}

	public void setTutorialCenters(Set<TutorialCenter> tutorialCenters) {
		this.tutorialCenters = tutorialCenters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<StudentDetails> getStudentDetailses() {
		return this.studentDetailses;
	}

	public void setStudentDetailses(Set<StudentDetails> studentDetailses) {
		this.studentDetailses = studentDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<InstantPostTutorRequirement> getInstantPostTutorRequirements() {
		return this.instantPostTutorRequirements;
	}

	public void setInstantPostTutorRequirements(Set<InstantPostTutorRequirement> instantPostTutorRequirements) {
		this.instantPostTutorRequirements = instantPostTutorRequirements;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<SchoolBoard> getSchoolBoards() {
		return this.schoolBoards;
	}

	public void setSchoolBoards(Set<SchoolBoard> schoolBoards) {
		this.schoolBoards = schoolBoards;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<TutorDetails> getTutorDetailses() {
		return this.tutorDetailses;
	}

	public void setTutorDetailses(Set<TutorDetails> tutorDetailses) {
		this.tutorDetailses = tutorDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationName")
	public Set<UniversityInstitute> getUniversityInstitutes() {
		return this.universityInstitutes;
	}

	public void setUniversityInstitutes(Set<UniversityInstitute> universityInstitutes) {
		this.universityInstitutes = universityInstitutes;
	}

}
