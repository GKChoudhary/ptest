package com.pcs.entities;
// Generated 26 Sep, 2018 2:57:25 PM by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Aaa generated by hbm2java
 */
@Entity
@Table(name = "aaa", catalog = "ptutors_db")
public class Aaa implements java.io.Serializable {

	private int Id;
	private String name;

	public Aaa() {
	}

	public Aaa(int Id) {
        this.Id = Id;
    }

	public Aaa(int Id, String name) {
       this.Id = Id;
       this.name = name;
    }

	@Id 

    
    @Column(name="Id", unique=true, nullable=false)
    public int getId() {
        return this.Id;
    }

	public void setId(int Id) {
        this.Id = Id;
    }

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
