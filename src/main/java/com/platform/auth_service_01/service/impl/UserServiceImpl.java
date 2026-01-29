package com.platform.auth_service_01.service.impl;

import com.platform.auth_service_01.model.UserProfile;
import com.platform.auth_service_01.repository.UserRepository;
import com.platform.auth_service_01.service.UserService;
import com.platform.auth_service_01.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JwtUtil jwtUtil;
    public String createUser(UserProfile userProfile){
        System.out.println("enter in service");

        userRepository.save(userProfile);
        return "User Created";
    }
    public String authenticate(String username, String Password){
        Optional<UserProfile> userProfileOptional = userRepository.findByUsername(username);
        if(userProfileOptional.isEmpty()) return "User doesn't exist";
        String jwt = jwtUtil.generate(username);
        return "Token: "+jwt;
    }
}
