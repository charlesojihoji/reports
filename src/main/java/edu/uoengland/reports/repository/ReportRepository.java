package edu.uoengland.reports.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uoengland.reports.entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, UUID> {

}
