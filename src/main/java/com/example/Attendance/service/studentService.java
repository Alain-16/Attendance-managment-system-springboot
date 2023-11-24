package com.example.Attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Attendance.model.Student;

import com.example.Attendance.repository.studentRepository;


@Service
public class studentService {
	
	@Autowired
	private studentRepository studentrepository;
	
	
	public List<Student> getAllStudents() {
		return this.studentrepository.findAll();
	}

	public  Student create(Student student) {
		return this.studentrepository.save(student);

	}
	public Student getStudentById(Long id) {
		
		return studentrepository.findById(id).get();
		
	}
	
	public Student UpdateStudent(Student existStudent) {
		return this.studentrepository.save(existStudent);

	}

	public void deleteStudent(Long id) {
		this.studentrepository.deleteById(id);

	}

}
