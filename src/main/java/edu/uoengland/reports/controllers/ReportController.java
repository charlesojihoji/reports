package edu.uoengland.reports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uoengland.reports.entity.Grade;
import edu.uoengland.reports.service.ReportService;

@RestController
@RequestMapping("/reports")
public class ReportController {

	@Autowired
	private ReportService reportService;
	
	@GetMapping("/{studentName}")
	public List<Grade> generateStudentReport(@PathVariable String studentName){
		
		return reportService.generateStudentReport(studentName);
	}
	
	@GetMapping("/courseReport/{course}")
	public List<Grade> generateCourseReport(@PathVariable String course){
		
		return reportService.generateCourseReport(course);
	}
}
