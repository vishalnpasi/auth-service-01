package com.example.auth_service_03.service;

import com.example.auth_service_03.model.UserProfile;

import java.util.List;

public interface UserService {
    public String create(UserProfile userProfile);
    public List<UserProfile> getUsers();
}
