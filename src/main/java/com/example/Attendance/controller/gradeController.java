package com.example.Attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Attendance.model.Grade;

import com.example.Attendance.service.gradeService;

@Controller
public class gradeController {
	
	@Autowired
	private gradeService gradeservice;
	
	
	
	@RequestMapping(value = "/grade", method = RequestMethod.GET)
	public String ListStudent(Model model) {
		model.addAttribute("grades", gradeservice.getAllGrades());
		return "view_grade";
	}
	
	@RequestMapping(value = "/newGrade", method = RequestMethod.GET)
	public String createStudent(Model model) {
		Grade grade = new Grade();
		model.addAttribute("mygrades", grade);
		return "newGrade";

	}

	@RequestMapping(value = "/grade", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("mygrades") Grade mygrade) {
		//Employe myemp = new Employe();
		gradeservice.create(mygrade);
		return "redirect:/grade";
	}

	@GetMapping("/grade/{id}")
	public String deleteemploye(@PathVariable Long id) {
		gradeservice.deleteGrade(id);
		return "redirect:/grade";
	}

}
