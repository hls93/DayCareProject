package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Repos.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ChildController {

    @Autowired
    ChildRepository childRepo;

    @GetMapping("/daycares/child")
    public List<Child> childList(Integer id) {

        return childRepo.findAllByOwnerId(id);
    }

    @PostMapping("/daycares/child")
    public Child register(@RequestBody Child child) {

        return childRepo.save(child);
    }


}
