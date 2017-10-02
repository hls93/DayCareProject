package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.Users;
import com.ironyard.day_care_project.Repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersRepository userRepo;

    @GetMapping("/listUsers")
    public List<Users> userList(){

        return userRepo.findAll();
    }
}
