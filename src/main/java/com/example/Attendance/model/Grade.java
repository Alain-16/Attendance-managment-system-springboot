package com.example.Attendance.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="grade_Name",nullable=false)
	private String gradeName;

	
	public Grade() {
	
	}
	
	public Grade(String gradeName) {
		super();
		this.gradeName=gradeName;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGradeName() {
		return gradeName;
	}
 
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
	
}
