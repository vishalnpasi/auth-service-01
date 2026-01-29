package com.platform.auth_service_01.service;

import com.platform.auth_service_01.model.UserProfile;

public interface UserService {
    public String createUser(UserProfile userProfile);
    public String authenticate(String username, String password);
}
