package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Child;
import com.ironyard.day_care_project.Entity.Daycare;
import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.DaycareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@CrossOrigin(origins = "*")
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

    @PutMapping("/daycares/{id}")
    public ResponseEntity<Daycare> updateGroup(@PathVariable(value = "id") Integer id, @RequestBody Daycare daycareDetails){
        Daycare daycare = daycareRepo.findOne(id);
        if (daycare== null) {
            return ResponseEntity.notFound().build();
        }

        daycare.setAddress(daycareDetails.getAddress());
        daycare.setCity(daycareDetails.getCity());
        daycare.setState(daycareDetails.getState());
        daycare.setZipcode(daycareDetails.getZipcode());
        daycare.setName(daycareDetails.getName());
        daycare.setEmail(daycareDetails.getEmail());
        daycare.setPassword(daycareDetails.getPassword());

        Daycare updatedDaycare = daycareRepo.save(daycare);
        return ResponseEntity.ok(updatedDaycare);
    }

    @DeleteMapping("daycares/delete/{id}")
    public ResponseEntity<Daycare> deleteDaycare(@PathVariable(value= "id") Integer id) {
        Daycare daycare = daycareRepo.findOne(id);
        if (daycare == null) {
            return ResponseEntity.notFound().build();
        }

        daycareRepo.delete(daycare);
        return ResponseEntity.ok().build();
    }




}
