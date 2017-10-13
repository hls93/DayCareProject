package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Repos.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PutMapping("/daycares/child/{id}")
    public ResponseEntity<Child> updateGroup(@PathVariable(value = "id") Integer id, @RequestBody Child childDetails){
       Child child = childRepo.findOne(id);
        if (child == null) {
            return ResponseEntity.notFound().build();
        }
        child.setFirstName(childDetails.getFirstName());
        child.setLastName(childDetails.getLastName());
        child.setDob(childDetails.getDob());
        child.setParentEmail(childDetails.getParentEmail());
        child.setParentFirstName(childDetails.getParentFirstName());
        child.setParentLastName(childDetails.getParentLastName());
        child.setOwner(childDetails.getOwner());

        Child updatedChild = childRepo.save(child);
        return ResponseEntity.ok(updatedChild);
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
