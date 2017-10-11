package com.ironyard.day_care_project.Services;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Daycare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class ReportSenderService {

    private JavaMailSender javaMailSender;

    @Autowired
    public ReportSenderService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    @Autowired
    public ReportContentBuilder reportContentBuilder;

    public void prepareAndSend(String recipient, String message, String diapers) {

        MimeMessagePreparator messagePreparator = mimeMessage -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
            messageHelper.setTo(recipient);
            messageHelper.setFrom("irondaycare@gmail.com");
            messageHelper.setSubject("Daily Report for whatever");
            String content = reportContentBuilder.build(message, diapers);
            messageHelper.setText(content, true);
        };
        try{
            javaMailSender.send(messagePreparator);
        } catch (MailException e) {

        }




    }
}
