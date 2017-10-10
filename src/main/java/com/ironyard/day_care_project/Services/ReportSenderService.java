package com.ironyard.day_care_project.Services;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Daycare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ReportSenderService {

    private JavaMailSender javaMailSender;

    @Autowired
    public ReportSenderService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sendReport() throws MailException {

        SimpleMailMessage report = new SimpleMailMessage();
        report.setTo("cmr319@yahoo.com");
        report.setFrom("irondaycare@gmail.com");
        report.setSubject("Daily Report for whatever");
        report.setText("gibberish");

        javaMailSender.send(report);
    }
}
