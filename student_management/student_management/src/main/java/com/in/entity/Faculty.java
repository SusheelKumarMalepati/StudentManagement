package com.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="faculty")
@Data
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int facultyId;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false)
	private long phoneNumber;
	@Column(nullable=false)
	private String facultyEmail;
	@Column(nullable=false)
	private String facultyPassword;
	@Column(nullable=false)
	private String bloodGroup;
	
	public Faculty( String firstName, String lastName, long phoneNumber, String facultyEmail,
			String facultyPassword, String bloodGroup) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.facultyEmail = facultyEmail;
		this.facultyPassword = facultyPassword;
		this.bloodGroup = bloodGroup;
	}
	public Faculty() {
	}
	
}
