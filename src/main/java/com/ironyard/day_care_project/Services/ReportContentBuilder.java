package com.ironyard.day_care_project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Service
public class ReportContentBuilder {

    private TemplateEngine templateEngine;

    @Autowired
    public ReportContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(String message, String diapers) {
        Context context = new Context();
        context.setVariable("message", message);
        context.setVariable("diapers", diapers);
        return templateEngine.process("report", context);
    }
}
