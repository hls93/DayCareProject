package com.ironyard.day_care_project.Controllers;


import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.DaycareRepository;
import com.ironyard.day_care_project.Repos.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private GroupRepository groupRepo;

    @GetMapping("/daycares/groups")
    public List<Group> daycareList(){

        return groupRepo.findAll();
    }

}
