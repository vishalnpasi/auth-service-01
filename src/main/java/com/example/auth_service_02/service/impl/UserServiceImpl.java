package com.example.auth_service_02.service.impl;

import com.example.auth_service_02.model.UserProfile;
import com.example.auth_service_02.repository.UserRepository;
import com.example.auth_service_02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    public String create(UserProfile userProfile){
        userRepository.save(userProfile);
        return "User Saved";
    }
}
