package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Repos.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    @Autowired
    ReportRepository reportRepo;




}
