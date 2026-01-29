package com.platform.auth_service_01.util;

import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtUtil {

    private String SECRET = "AAAAAAAAAASSSSSSSSSSSSSSSEEEEEEEEEEEEEEASDFFFFFFFFFFFFFASDFFFFFFFFF";
    public String generate(String username){
        return Jwts.builder()
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ (60 * 60 * 1000)))  // 1 hour
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }
}
