package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Daycare;
import com.ironyard.day_care_project.Repos.DaycareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
public class DaycareController {

    @Autowired
    private DaycareRepository daycareRepo;

    @GetMapping("/daycares")
    public List<Daycare> daycareList(){

        return daycareRepo.findAll();
    }

    @PostMapping("/daycares/register")
    public Daycare register(@RequestBody Daycare daycare) {
        return daycareRepo.save(daycare);
    }

    @PostMapping("/daycares/authenticate")
    public Daycare authenticate(Principal principal) {

        return daycareRepo.findByEmail(principal.getName());
    }






}
