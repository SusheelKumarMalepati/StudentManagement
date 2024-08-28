package com.in.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="student")
@Data
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	@Column(nullable=false)
	private String firstName;
	@Column(nullable=false)
	private String lastName;
	@Column(nullable=false)
	private long phoneNumber;
	@Column(nullable=false)
	private String studentEmail;
	@Column(nullable=false)
	private String studentPassword;
	@Column(nullable=false)
	private String bloodGroup;
	public Student(int studentId, String firstName, String lastName, long phoneNumber, String studentEmail,
			String studentPassword, String bloodGroup) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.studentEmail = studentEmail;
		this.studentPassword = studentPassword;
		this.bloodGroup = bloodGroup;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
