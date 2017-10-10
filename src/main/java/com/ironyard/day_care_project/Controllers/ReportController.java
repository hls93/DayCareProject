package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Report;
import com.ironyard.day_care_project.Repos.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    @Autowired
    ReportRepository reportRepo;

    @GetMapping("/daycares/reports")
    public Report report(Report report)





}
