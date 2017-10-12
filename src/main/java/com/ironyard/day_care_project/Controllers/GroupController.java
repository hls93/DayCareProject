package com.ironyard.day_care_project.Controllers;


import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @PutMapping("/daycares/groups/{id}")
    public ResponseEntity<Group> updateGroup(@PathVariable(value = "id") Integer id, @RequestBody Group groupDetails){
        Group group = groupRepo.findOne(id);
        if (group == null) {
            return ResponseEntity.notFound().build();
        }
        group.setName(groupDetails.getName());
        group.setTeachers(groupDetails.getTeachers());
        group.setOwner(groupDetails.getOwner());

        Group updatedGroup = groupRepo.save(group);
        return ResponseEntity.ok(updatedGroup);
    }

    @DeleteMapping("daycares/groups/delete/{id}")
    public ResponseEntity<Group> deleteGroup(@PathVariable(value= "id") Integer id) {
       Group group = groupRepo.findOne(id);
       if (group == null) {
           return ResponseEntity.notFound().build();
       }

       groupRepo.delete(group);
       return ResponseEntity.ok().build();
    }



}
