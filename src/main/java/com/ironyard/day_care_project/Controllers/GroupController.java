package com.ironyard.day_care_project.Controllers;


import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.DaycareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private DaycareRepository daycareRepo;

    @GetMapping("/daycares/groups")
    public List<Group> daycareList(){

        return daycareRepo.findAll();
    }

}
