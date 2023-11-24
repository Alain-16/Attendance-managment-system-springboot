package com.example.Attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Attendance.repository.attendanceRepository;
import com.example.Attendance.model.*;

@Service
public class attendanceService {
	
	@Autowired
	private attendanceRepository attendancerepository;
	
	
	public List<Attendance> getAllStudents() {
		return this.attendancerepository.findAll();
	}

	public  Attendance create(Attendance attendance) {
		return this.attendancerepository.save(attendance);

	}
	public Attendance getStudentById(Long id) {
		
		return attendancerepository.findById(id).get();
		
	}
	
	public Attendance UpdateStudent(Attendance existStudent) {
		return this.attendancerepository.save(existStudent);

	}

	public void deleteStudent(Long id) {
		this.attendancerepository.deleteById(id);

	}
	

}
