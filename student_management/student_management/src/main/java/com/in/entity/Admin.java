package com.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="admin")
@Data
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	@Column(nullable=false)
	private String adminName;
	@Column(nullable=false)
	private String adminEmail;
	@Column(nullable=false)
	private String adminPassword;
	public Admin() {
	}
	public Admin( String adminName, String adminEmail, String adminPassword) {
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	
}
