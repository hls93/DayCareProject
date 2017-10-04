package com.ironyard.day_care_project.Controllers;

import com.ironyard.day_care_project.Entity.User;
import com.ironyard.day_care_project.Repos.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UsersRepository userRepo;

    @GetMapping("/users")
    public List<User> userList(){

        return userRepo.findAll();
    }

    @PostMapping("/users/register")
    public User register(@RequestBody User user) {
        return userRepo.save(user);
    }




}
