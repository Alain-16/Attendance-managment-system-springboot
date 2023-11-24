package com.example.Attendance.controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Attendance.model.Student;
import com.example.Attendance.service.studentService;

@Controller
public class studentController {
	
	@Autowired
	private studentService studentservice;
	
	
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String ListStudent(Model model) {
		model.addAttribute("mystudent", studentservice.getAllStudents());
		return "view_student";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String createStudent(Model model) {
		Student student = new Student();
		model.addAttribute("mystudents", student);
		return "newStudent";

	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("mystudents") Student mystu) {
		studentservice.create(mystu);
		return "redirect:/student";
	}
	
	

	@RequestMapping(value = "/student/edit/{id}", method = RequestMethod.GET)
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("Editstudent", studentservice.getStudentById(id));
		return "editForm";
	}

	@RequestMapping(value = "/student/edit/{id}", method = RequestMethod.POST)
	public String updateemploye(@PathVariable Long id, @ModelAttribute("student") Student att, Model model) throws Exception {

		Student existStudent = studentservice.getStudentById(id);
		
		existStudent.setId(id);
		existStudent.setStudentName(att.getStudentName());
		existStudent.setRollNo(att.getRollNo());
		existStudent.setStudentGrade(att.getStudentGrade());
		existStudent.setJoinDate(att.getJoinDate());


		studentservice.UpdateStudent(existStudent);
		return "redirect:/student";
	}

	@GetMapping("/student/{id}")
	public String deleteemploye(@PathVariable Long id) {
		studentservice.deleteStudent(id);
		return "redirect:/student";
	}

}
