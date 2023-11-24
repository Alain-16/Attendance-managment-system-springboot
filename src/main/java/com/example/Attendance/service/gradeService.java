package com.example.Attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Attendance.model.Grade;
import com.example.Attendance.repository.gradeRepository;

@Service
public class gradeService {
	
	@Autowired
	private gradeRepository graderepository;
	
	
	public List<Grade> getAllGrades() {
		return this.graderepository.findAll();
	}

	public  Grade create(Grade grade) {
		return this.graderepository.save(grade);

	}
	public Grade getGradeById(Long id) {
		
		return graderepository.findById(id).get();
		
	}
	
	public Grade UpdateGrade(Grade existGrade) {
		return this.graderepository.save(existGrade);

	}

	public void deleteGrade(Long id) {
		this.graderepository.deleteById(id);

	}

}
