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
 * CcaTutor generated by hbm2java
 */
@Entity
@Table(name = "cca_tutor", catalog = "ptutors_db", uniqueConstraints = @UniqueConstraint(columnNames = { "username",
		"id", "contact.no", "password", "email" }))
public class CcaTutor implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String secretQuestion;
	private String answer;
	private String name;
	private String dob;
	private String gender;
	private String natioonality;
	private String contactNo;
	private String address;
	private String pincode;
	private String email;
	private byte[] profiePicture;
	private String subject;
	private String languagesKnown;
	private String academicPortfolio;
	private String achievement;
	private String expirience;
	private String skills;
	private String feeStructure;
	private String preferedArea;
	private String iteractiionType;
	private String place;
	private String textTestimonials;
	private byte[] videoTestimonials;
	private String membershipType;
	private String subscription;
	private String modeOfPayment;
	private Set<CcaTutorLanguage> ccaTutorLanguages = new HashSet<CcaTutorLanguage>(0);

	public CcaTutor() {
	}

	public CcaTutor(String username, String password, String secretQuestion, String answer, String name, String dob, String gender, String natioonality, String contactNo, String address, String pincode, String email, byte[] profiePicture, String subject, String languagesKnown, String academicPortfolio, String achievement, String expirience, String skills, String feeStructure, String preferedArea, String iteractiionType, String place, String textTestimonials, byte[] videoTestimonials, String membershipType, String subscription, String modeOfPayment, Set<CcaTutorLanguage> ccaTutorLanguages) {
       this.username = username;
       this.password = password;
       this.secretQuestion = secretQuestion;
       this.answer = answer;
       this.name = name;
       this.dob = dob;
       this.gender = gender;
       this.natioonality = natioonality;
       this.contactNo = contactNo;
       this.address = address;
       this.pincode = pincode;
       this.email = email;
       this.profiePicture = profiePicture;
       this.subject = subject;
       this.languagesKnown = languagesKnown;
       this.academicPortfolio = academicPortfolio;
       this.achievement = achievement;
       this.expirience = expirience;
       this.skills = skills;
       this.feeStructure = feeStructure;
       this.preferedArea = preferedArea;
       this.iteractiionType = iteractiionType;
       this.place = place;
       this.textTestimonials = textTestimonials;
       this.videoTestimonials = videoTestimonials;
       this.membershipType = membershipType;
       this.subscription = subscription;
       this.modeOfPayment = modeOfPayment;
       this.ccaTutorLanguages = ccaTutorLanguages;
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

	@Column(name = "username", length = 20)
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

	@Column(name = "secret_question", length = 50)
	public String getSecretQuestion() {
		return this.secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	@Column(name = "answer", length = 50)
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "dob", length = 20)
	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "natioonality", length = 20)
	public String getNatioonality() {
		return this.natioonality;
	}

	public void setNatioonality(String natioonality) {
		this.natioonality = natioonality;
	}

	@Column(name="contactNo", length=10)
    public String getContactNo() {
        return this.contactNo;
    }

	public void setContactNo(
	String contactNo)
	{
		this.contactNo = contactNo;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "pincode", length = 10)
	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Column(name = "email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "profie_picture")
	public byte[] getProfiePicture() {
		return this.profiePicture;
	}

	public void setProfiePicture(byte[] profiePicture) {
		this.profiePicture = profiePicture;
	}

	@Column(name = "subject", length = 30)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "languages_known", length = 100)
	public String getLanguagesKnown() {
		return this.languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	@Column(name = "academic portfolio", length = 200)
	public String getAcademicPortfolio() {
		return this.academicPortfolio;
	}

	public void setAcademicPortfolio(String academicPortfolio) {
		this.academicPortfolio = academicPortfolio;
	}

	@Column(name = "achievement", length = 200)
	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	@Column(name = "expirience", length = 5)
	public String getExpirience() {
		return this.expirience;
	}

	public void setExpirience(String expirience) {
		this.expirience = expirience;
	}

	@Column(name = "skills", length = 100)
	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Column(name = "fee structure", length = 100)
	public String getFeeStructure() {
		return this.feeStructure;
	}

	public void setFeeStructure(String feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Column(name = "prefered_area", length = 20)
	public String getPreferedArea() {
		return this.preferedArea;
	}

	public void setPreferedArea(String preferedArea) {
		this.preferedArea = preferedArea;
	}

	@Column(name = "iteractiion_type", length = 20)
	public String getIteractiionType() {
		return this.iteractiionType;
	}

	public void setIteractiionType(String iteractiionType) {
		this.iteractiionType = iteractiionType;
	}

	@Column(name = "place", length = 20)
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "text_testimonials", length = 100)
	public String getTextTestimonials() {
		return this.textTestimonials;
	}

	public void setTextTestimonials(String textTestimonials) {
		this.textTestimonials = textTestimonials;
	}

	@Column(name = "video_testimonials")
	public byte[] getVideoTestimonials() {
		return this.videoTestimonials;
	}

	public void setVideoTestimonials(byte[] videoTestimonials) {
		this.videoTestimonials = videoTestimonials;
	}

	@Column(name = "membership_type", length = 30)
	public String getMembershipType() {
		return this.membershipType;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	@Column(name = "subscription", length = 30)
	public String getSubscription() {
		return this.subscription;
	}

	public void setSubscription(String subscription) {
		this.subscription = subscription;
	}

	@Column(name = "mode_of_payment", length = 30)
	public String getModeOfPayment() {
		return this.modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ccaTutor")
	public Set<CcaTutorLanguage> getCcaTutorLanguages() {
		return this.ccaTutorLanguages;
	}

	public void setCcaTutorLanguages(Set<CcaTutorLanguage> ccaTutorLanguages) {
		this.ccaTutorLanguages = ccaTutorLanguages;
	}

}
