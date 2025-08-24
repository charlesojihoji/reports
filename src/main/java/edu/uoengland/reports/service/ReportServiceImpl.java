package edu.uoengland.reports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uoengland.reports.entity.Grade;
import edu.uoengland.reports.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository reportRepository;
	
	@Override
	public List<Grade> generateStudentReport(String studentName) {

		 return reportRepository.findByStudentsFullName(studentName);
	}

	@Override
	public List<Grade> generateCourseReport(String courseName) {
		
		return reportRepository.findByCourseName(courseName);
	}

}
