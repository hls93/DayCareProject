package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Daycare;
import com.ironyard.day_care_project.Entity.Group;
import com.ironyard.day_care_project.Repos.DaycareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @DeleteMapping("daycares/delete/{id}")
    public Daycare deleteDaycare(@PathVariable Integer id) {
        return new Daycare(id, HttpStatus.OK);
    }




}
