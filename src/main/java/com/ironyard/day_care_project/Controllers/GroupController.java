package com.ironyard.day_care_project.Controllers;


import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class GroupController {

    @Autowired
    private GroupRepository groupRepo;

    @GetMapping("/daycares/groups")
    public List<Group> daycareList(Principal principal){

        return groupRepo.findAllByOwnerEmail(principal.getName());
    }

    @PostMapping("/daycares/groups")
    public Group register(@RequestBody Group group) {
        return groupRepo.save(group);
    }

    @DeleteMapping("daycares/groups/delete/{id}")
    public Group deleteGroup(@PathVariable Integer id) {
        return new Group(id, HttpStatus.OK);
    }

}
