package com.example.auth_service_03.service.impl;

import com.example.auth_service_03.model.UserProfile;
import com.example.auth_service_03.repository.UserRepository;
import com.example.auth_service_03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepo;
    public String create(UserProfile userProfile){
        UserProfile userProfile1  = userRepo.save(userProfile);
        return userProfile1.getUsername()+" is saved successfully";
    }

    public List<UserProfile> getUsers() {
        List<UserProfile> userList = userRepo.findAll();
        List<UserProfile> newUserList = userList.stream()
                .filter(user -> !user.getUsername().equals("admin"))
//                .toList();
                .collect(Collectors.toList());
        newUserList.add(new UserProfile());
        return newUserList;
    }
}
