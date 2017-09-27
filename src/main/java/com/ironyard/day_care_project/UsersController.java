package com.ironyard.day_care_project;

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
