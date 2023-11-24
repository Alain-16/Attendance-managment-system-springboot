package com.example.Attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Attendance.model.Attendance;
import com.example.Attendance.model.form;
import com.example.Attendance.service.attendanceService;

@Controller
public class teacherPanelController {
	
	@Autowired
	private attendanceService attendanceservice;
	
	
	@RequestMapping(value = "/teacherpanel", method = RequestMethod.GET)
	public String ListAttendances(Model model) {
		model.addAttribute("attendances", attendanceservice.getAllStudents());
		//model.addAttribute("myemp",new Employe());
		return "teacher_panel";
	}

	@RequestMapping(value = "/makenewattendance", method = RequestMethod.GET)
	public String createStudent(Model model) {
		//Attendance student = new Attendance();
		model.addAttribute("attendance", attendanceservice.getAllStudents());
		return "makeAtt";

	}

	@RequestMapping(value = "/teacherpanel", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("attendance") Attendance attendance) {
		//model.addAttributeModelMap model("studentName",attendance.getStudentName());
		//model.addAttribute("Grade", attendance.getGrade());
		//Employe myemp = new Employe();
		attendanceservice.create(attendance);
		return "redirect:/teacher_panel";
	}

	@RequestMapping(value = "/teacherpanel/edit/{id}", method = RequestMethod.GET)
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", attendanceservice.getStudentById(id));
		return "EmpEdit";
	}

	@RequestMapping(value = "/teacherpanel/edit/{id}", method = RequestMethod.POST)
	public String updateemploye(@PathVariable Long id, @ModelAttribute("student") Attendance att, Model model) throws Exception {

		Attendance existStudent = attendanceservice.getStudentById(id);
		
		existStudent.setId(id);
		existStudent.setStudentName(att.getStudentName());
		existStudent.setGrade(att.getGrade());
		existStudent.setStatus(att.getStatus());
		existStudent.setAttDate(att.getAttDate());
		existStudent.setAttDay(att.getAttDay());
		existStudent.setTeacherName(att.getTeacherName());


		attendanceservice.UpdateStudent(existStudent);
		return "redirect:/employe";
	}

	@GetMapping("/teacherpanel/{id}")
	public String deleteemploye(@PathVariable Long id) {
		attendanceservice.deleteStudent(id);
		return "redirect:/employe";
	}

}
