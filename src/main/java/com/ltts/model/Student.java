package com.ltts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email_Id")
	private String emailId;
	
	
	public Student() {
		
	}
	public Student(String firstname, String lastname, String emialId) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		this.emailId = emialId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emialId) {
		this.emailId = emialId;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ", emialId=" + emailId
				+ "]";
	}
}
