package com.example.Attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Attendance.model.Teacher;
import com.example.Attendance.repository.teacherRepository;

@Service
public class teacherService {
	
	@Autowired
	private teacherRepository teacherrepository;
	
	
	public List<Teacher> getAllTeachers() {
		return this.teacherrepository.findAll();
	}

	public  Teacher create(Teacher teacher) {
		return this.teacherrepository.save(teacher);

	}
	public Teacher getTeacherById(Long id) {
		
		return teacherrepository.findById(id).get();
		
	}
	
	public Teacher UpdateTeacher(Teacher existTeacher) {
		return this.teacherrepository.save(existTeacher);

	}

	public void deleteTeacher(Long id) {
		this.teacherrepository.deleteById(id);

	}

}
