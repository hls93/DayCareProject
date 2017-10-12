package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Entity.Report;
import com.ironyard.day_care_project.Repos.ReportRepository;
import com.ironyard.day_care_project.Services.ReportContentBuilder;
import com.ironyard.day_care_project.Services.ReportSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class ReportController {

    @Autowired
    ReportRepository reportRepo;

    @Autowired
    ReportSenderService reportSenderService;

    @Autowired
    ReportContentBuilder reportContentBuilder;

    @GetMapping("/daycares/reports")
    public List<Report> report() {

        return reportRepo.findAll();
    }

    @PostMapping("/daycares/reports")
    public Report post(@RequestBody Report report) {
       // return reportRepo.save(report);
        reportSenderService.prepareAndSend("cmr319@yahoo.com", "Daily Report", "changed at 10");
        return null;
    }

//    @PutMapping("/daycares/reports")
//    public Report putReports(@PathVariable Integer id, @RequestBody Report report){
//        report = reportRepo.update(id, report);
//        return new Report(report, HttpStatus.OK);
//    }

    @DeleteMapping("daycares/report/delete/{id}")
    public ResponseEntity<Report> deleteChild(@PathVariable(value= "id") Integer id) {
        Report report = reportRepo.findOne(id);
        if (report == null) {
            return ResponseEntity.notFound().build();
        }

        reportRepo.delete(report);
        return ResponseEntity.ok().build();
    }


}
