package com.example.Attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Attendance.model.Teacher;
import com.example.Attendance.service.teacherService;

@Controller
public class teacherController {
	
	@Autowired
	private teacherService teacherservice;
	
	@RequestMapping(value="/teacher",method=RequestMethod.GET)
	public String ListTeachers(Model model) {
		model.addAttribute("activeTeacher",teacherservice.getAllTeachers());
		return "view_teacher";
	}
	
	
	
	@RequestMapping(value = "/newTeacher", method = RequestMethod.GET)
	public String createTeacher(Model model) {
		Teacher teacher = new Teacher();
		model.addAttribute("myteachers", teacher);
		return "newTeacher";

	}

	@RequestMapping(value = "/teacher", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("myteachers") Teacher mytr) {
		teacherservice.create(mytr);
		return "redirect:/teacher";
	}

	@RequestMapping(value = "/teacher/edit/{id}", method = RequestMethod.GET)
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("teacherEdit", teacherservice.getTeacherById(id));
		return "TeacherEdit";
	}

	@RequestMapping(value = "/teacher/edit/{id}", method = RequestMethod.POST)
	public String updateemploye(@PathVariable Long id, @ModelAttribute("teacherEdit") Teacher tr, Model model) throws Exception {

		Teacher existTeacher = teacherservice.getTeacherById(id);
		
		existTeacher.setId(id);
		existTeacher.setTeacherName(tr.getTeacherName());
		existTeacher.setPassword(tr.getPassword());
		existTeacher.setAddress(tr.getAddress());
		existTeacher.setEmail(tr.getEmail());
		existTeacher.setResidance(tr.getResidance());
		existTeacher.setQualification(tr.getQualification());
		existTeacher.setGrade(tr.getGrade());
		existTeacher.setJoinDate(tr.getJoinDate());
		
		teacherservice.UpdateTeacher(existTeacher);
		return "redirect:/teacher";
	}

	@GetMapping("/teacher/{id}")
	public String deleteemploye(@PathVariable Long id) {
		teacherservice.deleteTeacher(id);
		return "redirect:/teacher";
	}


}
