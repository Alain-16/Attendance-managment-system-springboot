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
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "student_Name", nullable = true)
	private String studentName;
	
	@Column(name="roll_no", nullable=true)
	private int rollNo;
	
	@Column(name = "student_Grade", nullable = true)
	private String studentGrade;
	
	@JsonFormat(pattern="MM-dd-yyyy", shape=Shape.STRING)
	@Column(name="join_date",nullable=true)
	private String joinDate;

	
	
	
	public Student() {
		
	}
	
	
	
	public Student(String stuName,int RollNo,String stuGrade,String JoinDate) {
		super();
		this.studentName=stuName;
		this.rollNo = RollNo;
		this.studentGrade=stuGrade;
		this.joinDate=JoinDate;
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

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	


}
