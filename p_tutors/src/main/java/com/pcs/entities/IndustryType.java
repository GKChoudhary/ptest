package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * IndustryType generated by hbm2java
 */
@Entity
@Table(name = "industry_type", catalog = "ptutors_db")
public class IndustryType implements java.io.Serializable {

	private Integer industryId;
	private String industryName;

	public IndustryType() {
	}

	public IndustryType(String industryName) {
		this.industryName = industryName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "industry_id", unique = true, nullable = false)
	public Integer getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	@Column(name = "industry_name", length = 100)
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

}
