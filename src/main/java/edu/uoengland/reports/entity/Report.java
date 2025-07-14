package edu.uoengland.reports.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Reports")
public class Report {

	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="id")
	private int reportId;
	
	@Column(name="student_name", nullable=false)
	private String studentName;
	
	@Column(name="course")
	private String course;
	
	@Column(name="grade")
	private String grade;
	
	public Report() {
		super();
	}

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
