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
import javax.persistence.UniqueConstraint;

/**
 * CcaStudent generated by hbm2java
 */
@Entity
@Table(name = "cca_student", catalog = "ptutors_db", uniqueConstraints = @UniqueConstraint(columnNames = { "username",
		"password" }))
public class CcaStudent implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String secretquestion;
	private String answer;
	private String name;
	private String gender;
	private String age;
	private String location;
	private String area;
	private String landmark;
	private String address;
	private String guardianname;
	private String contactno;
	private String emailaddress;
	private String preferedcalltime;
	private String tutorfor;
	private String level;
	private String experienceyear;
	private String tutorgender;
	private String feesstructure;
	private String remarks;
	private Set<CcaStudentLanguage> ccaStudentLanguages = new HashSet<CcaStudentLanguage>(0);

	public CcaStudent() {
	}

	public CcaStudent(String username, String password, String secretquestion, String answer, String name, String gender, String age, String location, String area, String landmark, String address, String guardianname, String contactno, String emailaddress, String preferedcalltime, String tutorfor, String level, String experienceyear, String tutorgender, String feesstructure, String remarks, Set<CcaStudentLanguage> ccaStudentLanguages) {
       this.username = username;
       this.password = password;
       this.secretquestion = secretquestion;
       this.answer = answer;
       this.name = name;
       this.gender = gender;
       this.age = age;
       this.location = location;
       this.area = area;
       this.landmark = landmark;
       this.address = address;
       this.guardianname = guardianname;
       this.contactno = contactno;
       this.emailaddress = emailaddress;
       this.preferedcalltime = preferedcalltime;
       this.tutorfor = tutorfor;
       this.level =level;
       this.experienceyear = experienceyear;
       this.tutorgender = tutorgender;
       this.feesstructure = feesstructure;
       this.remarks = remarks;
       this.ccaStudentLanguages = ccaStudentLanguages;
    }

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 16)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "secretquestion", length = 50)
	public String getSecretquestion() {
		return this.secretquestion;
	}

	public void setSecretquestion(String secretquestion) {
		this.secretquestion = secretquestion;
	}

	@Column(name = "answer", length = 100)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gender", length = 50)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age", length = 50)
	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(name = "location", length = 50)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "area", length = 50)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "landmark", length = 50)
	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Column(name = "address", length = 300)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "guardianname", length = 50)
	public String getGuardianname() {
		return this.guardianname;
	}

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

	@Column(name = "contactno", length = 50)
	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	@Column(name = "emailaddress", length = 30)
	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	@Column(name = "preferedcalltime", length = 50)
	public String getPreferedcalltime() {
		return this.preferedcalltime;
	}

	public void setPreferedcalltime(String preferedcalltime) {
		this.preferedcalltime = preferedcalltime;
	}

	@Column(name = "tutorfor", length = 50)
	public String getTutorfor() {
		return this.tutorfor;
	}

	public void setTutorfor(String tutorfor) {
		this.tutorfor = tutorfor;
	}

	@Column(name="level", length=50)
    public String getLevel() {
        return this.level;
    }

	public void setLevel(String level) {
        this.level = level;
    }

	@Column(name = "experienceyear", length = 50)
	public String getExperienceyear() {
		return this.experienceyear;
	}

	public void setExperienceyear(String experienceyear) {
		this.experienceyear = experienceyear;
	}

	@Column(name = "tutorgender", length = 50)
	public String getTutorgender() {
		return this.tutorgender;
	}

	public void setTutorgender(String tutorgender) {
		this.tutorgender = tutorgender;
	}

	@Column(name = "feesstructure", length = 50)
	public String getFeesstructure() {
		return this.feesstructure;
	}

	public void setFeesstructure(String feesstructure) {
		this.feesstructure = feesstructure;
	}

	@Column(name = "remarks", length = 50)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ccaStudent")
	public Set<CcaStudentLanguage> getCcaStudentLanguages() {
		return this.ccaStudentLanguages;
	}

	public void setCcaStudentLanguages(Set<CcaStudentLanguage> ccaStudentLanguages) {
		this.ccaStudentLanguages = ccaStudentLanguages;
	}

}
