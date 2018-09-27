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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TeachingMedium generated by hbm2java
 */
@Entity
@Table(name = "teaching_medium", catalog = "ptutors_db")
public class TeachingMedium implements java.io.Serializable {

	private Integer mediumId;
	private String mediumName;
	private Set<StudentDetails> studentDetailses = new HashSet<StudentDetails>(0);
	private Set<TutorMedium> tutorMediums = new HashSet<TutorMedium>(0);

	public TeachingMedium() {
	}

	public TeachingMedium(String mediumName) {
		this.mediumName = mediumName;
	}

	public TeachingMedium(String mediumName, Set<StudentDetails> studentDetailses, Set<TutorMedium> tutorMediums) {
		this.mediumName = mediumName;
		this.studentDetailses = studentDetailses;
		this.tutorMediums = tutorMediums;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "MEDIUM_ID", unique = true, nullable = false)
	public Integer getMediumId() {
		return this.mediumId;
	}

	public void setMediumId(Integer mediumId) {
		this.mediumId = mediumId;
	}

	@Column(name = "MEDIUM_NAME", nullable = false, length = 200)
	public String getMediumName() {
		return this.mediumName;
	}

	public void setMediumName(String mediumName) {
		this.mediumName = mediumName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teachingMedium")
	public Set<StudentDetails> getStudentDetailses() {
		return this.studentDetailses;
	}

	public void setStudentDetailses(Set<StudentDetails> studentDetailses) {
		this.studentDetailses = studentDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teachingMedium")
	public Set<TutorMedium> getTutorMediums() {
		return this.tutorMediums;
	}

	public void setTutorMediums(Set<TutorMedium> tutorMediums) {
		this.tutorMediums = tutorMediums;
	}

}