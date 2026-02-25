package com.example.auth_service_03.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User-Profile")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfile {
    @Id
    String id;
    String username;
    String password;
}
