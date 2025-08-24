package edu.uoengland.reports.service;

import java.util.List;

import edu.uoengland.reports.entity.Grade;

public interface ReportService {

	public List<Grade> generateStudentReport(String studentName);

	public List<Grade> generateCourseReport(String course);
}
