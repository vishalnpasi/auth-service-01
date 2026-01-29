package com.platform.auth_service_01.repository;

import com.platform.auth_service_01.model.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserProfile, String> {
    public Optional<UserProfile> findByUsername(String username);
}
