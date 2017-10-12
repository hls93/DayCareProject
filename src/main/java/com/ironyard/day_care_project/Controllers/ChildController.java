package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ChildController {

    @Autowired
    ChildRepository childRepo;

    @GetMapping("/daycares/groups/{id}/childen")
    public List<Child> childList(@PathVariable(name = "id") Integer id) {

        return childRepo.findAllByOwnerId(id);
    }

    @GetMapping("/daycares/roster")
    public  List<Child> childList(){
        return childRepo.findAll();
    }

    @PostMapping("/daycares/child")
    public Child register(@RequestBody Child child) {

        return childRepo.save(child);
    }


    @DeleteMapping("daycares/child/delete/{id}")
    public ResponseEntity<Child> deleteChild(@PathVariable(value= "id") Integer id) {
        Child child = childRepo.findOne(id);
        if (child == null) {
            return ResponseEntity.notFound().build();
        }

        childRepo.delete(child);
        return ResponseEntity.ok().build();
    }


}
