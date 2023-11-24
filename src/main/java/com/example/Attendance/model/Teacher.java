package com.example.Attendance.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="teacher_Name",nullable=false)
	private String teacherName;
	
	@Column(name="password",nullable=false)
	private int password;
	
	@Column(name="address",nullable=true)
	private String Address;
	
	@Column(name="email",nullable=false)
	private String Email;
	
	@Column(name="residance",nullable=false)
	private String Residance;
	
	@Column(name="qualification",nullable=true)
	private String Qualification;
	
	@Column(name="gender",nullable=true)
	private String Gender;
	
	@Column(name="grade",nullable=true)
    private String Grade;
	
	@JsonFormat(pattern="MM-dd-yyyy", shape=Shape.STRING)
	@Column(name="join_date",nullable=true)
	private String joinDate;
	
	public Teacher() {
		
	}
	
	public Teacher(String TeacherName,int password,String Address,String Email,String Residance,String qualification,String gender,String Grade,String JoinDate) {
		super();
		this.teacherName=TeacherName;
		this.password=password;
		this.Address=Address;
		this.Email=Email;
		this.Residance=Residance;
		this.Qualification= qualification;
		this.Gender=gender;
		this.Grade=Grade;
		this.joinDate=JoinDate;
		
		
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getResidance() {
		return Residance;
	}

	public void setResidance(String residance) {
		Residance = residance;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	
	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	

	
	
}
    