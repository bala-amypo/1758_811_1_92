package com.example.demo.config;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(Long id, String email, String role) {
        return id + ":" + email + ":" + role;
    }
}
