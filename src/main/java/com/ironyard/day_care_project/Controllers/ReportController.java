package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Report;
import com.ironyard.day_care_project.Repos.ReportRepository;
import com.ironyard.day_care_project.Services.ReportContentBuilder;
import com.ironyard.day_care_project.Services.ReportSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



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

    @GetMapping("/daycares/reports/{id}")
    public ResponseEntity<Report> getReportById(@PathVariable(value = "id") Integer id ) {
        Report report = reportRepo.findOne(id);
        if (report == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(report);
    }

    @PostMapping("daycare/reports")
    public  Report save(@RequestBody Report report) {

        return reportRepo.save(report);
    }

//    @PostMapping("/daycares/reports")
//    public Report post(@RequestBody Report report) {
//       // return reportRepo.save(report);
//        reportSenderService.prepareAndSend("cmr319@yahoo.com", "Daily Report", "changed at 10");
//        return null;
//    }


    @PutMapping("/daycares/reports/{id}")
    public ResponseEntity<Report> updateGroup(@PathVariable(value = "id") Integer id, @RequestBody Report reportDetails){
        Report report = reportRepo.findOne(id);
        if (report == null) {
            return ResponseEntity.notFound().build();
        }

        report.setDiaperChange(reportDetails.getDiaperChange());
        report.setItemsNeeded(reportDetails.getItemsNeeded());
        report.setMeals(reportDetails.getMeals());
        report.setNaps(reportDetails.getNaps());
        report.setNote(reportDetails.getNote());
        report.setOwner(reportDetails.getOwner());

        Report updatedReport = reportRepo.save(report);
        return ResponseEntity.ok(updatedReport);
    }

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
