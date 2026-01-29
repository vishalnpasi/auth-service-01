package com.platform.auth_service_01.controller;

import com.platform.auth_service_01.model.UserProfile;
import com.platform.auth_service_01.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public String createUser(@RequestBody UserProfile userProfile){
        return userService.createUser(userProfile);
    }
    @GetMapping("/authenticate/{username}/{password}")
    public String authenticate(@PathVariable String username,@PathVariable String password, @RequestBody UserProfile userProfile){

        return userService.authenticate(username, password);
    }
}
