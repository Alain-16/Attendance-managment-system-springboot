package com.example.Attendance.model;

import java.util.Date;
//
 import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="attendance")
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="student_Name",nullable=false)
	private String studentName;
	
	@Column(name="roll_No", nullable=true)
	private Integer rollNo;
	
	@Column(name="grade",nullable=false)
	private String Grade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status",nullable=false)
	private AttStatus Status;
	
	
	@JsonFormat(pattern="MM-dd-YYYY", shape=Shape.STRING)
	@Column(name="att_date",nullable=true)
	private String AttDate;
	
	@Column(name="att_day",nullable=true)
	private String AttDay;
	
	@Column(name="teacher_Name",nullable=true)
	private String teacherName;
	
	//private List<Attendance> att;
	
	
	public Attendance() {
	}
	
	public Attendance(String studentName,String Grade,int rollNo,AttStatus Status,String AttDate,String AttDay,String teacherName) {
		super();
		this.studentName=studentName;
		this.Grade=Grade;
		this.rollNo=rollNo;
		this.Status=Status;
		this.AttDate=AttDate;
		this.AttDay=AttDay;
		this.teacherName=teacherName;
	}
	

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public AttStatus getStatus() {
		return Status;
	}

	public void setStatus(AttStatus status) {
		Status = status;
	}

	public String getAttDate() {
		return AttDate;
	}

	public void setAttDate(String attDate) {
		AttDate = attDate;
	}

	public String getAttDay() {
		return AttDay;
	}

	public void setAttDay(String attDay) {
		AttDay = attDay;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	/*public void addAtt(Attendance attenda) {
		this.att.add(attenda);
	}*/
	
	

}
