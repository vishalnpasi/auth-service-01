package com.example.auth_service_03.controller;

import com.example.auth_service_03.model.UserProfile;
import com.example.auth_service_03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/user")
    public String create(@RequestBody UserProfile userProfile){
        String res = userService.create(userProfile);

        return res;
    }
    @GetMapping("/user")
    public List<UserProfile> getUsers(){
        List<UserProfile> userList = userService.getUsers();
        return userList;
    }
}
