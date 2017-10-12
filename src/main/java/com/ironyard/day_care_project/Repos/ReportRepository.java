package com.ironyard.day_care_project.Repos;

import com.ironyard.day_care_project.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Integer> {

    List<Report> findAllByOwnerId(Integer id);
}
