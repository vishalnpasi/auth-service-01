package com.example.auth_service_02.repository;

import com.example.auth_service_02.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<UserProfile, String> {
}
