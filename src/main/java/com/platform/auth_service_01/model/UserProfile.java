package com.platform.auth_service_01.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor@NoArgsConstructor@Data@Builder
public class UserProfile {
    @Id
    String id;
    String username;
    String password;

}
