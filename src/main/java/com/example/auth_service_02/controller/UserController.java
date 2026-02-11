package com.example.auth_service_02.controller;

import com.example.auth_service_02.model.UserProfile;
import com.example.auth_service_02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String create(@RequestBody UserProfile userProfile){
        return userService.create(userProfile);
    }
}
