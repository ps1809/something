package com.something.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="admin")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"created_on","updated_on"},allowGetters=true)
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="username")
	@NotBlank
	private String adminKey;
	
	@Column(name="password")
	@NotBlank
	private String adminSecret;
	
	@Column(name="created_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_on;
	
	@Column(name="updated_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated_on;

	public String getAdminKey() {
		return adminKey;
	}

	public void setAdminKey(String adminKey) {
		this.adminKey = adminKey;
	}

	public String getAdminSecret() {
		return adminSecret;
	}

	public void setAdminSecret(String adminSecret) {
		this.adminSecret = adminSecret;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public Admin(int id, String adminKey, String adminSecret, Date created_on, Date updated_on) {
		super();
		this.id = id;
		this.adminKey = adminKey;
		this.adminSecret = adminSecret;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}
	
	public Admin(){
		
	}
	
}
