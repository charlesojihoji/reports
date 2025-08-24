package edu.uoengland.reports.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uoengland.reports.entity.Grade;

@Repository
public interface ReportRepository extends JpaRepository<Grade, UUID> {

	public List<Grade> findByStudentsFullName(String studentName);

	public List<Grade> findByCourseName(String courseName);
}
