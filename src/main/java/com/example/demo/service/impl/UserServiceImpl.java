package com.example.demo.service.impl;

import com.example.demo.config.JwtUtil;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public UserServiceImpl(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public String login(String email, String password) {
        User user = userRepository.findByEmail(email);
        return jwtUtil.generateToken(user.getId(), user.getEmail(), "USER");
    }
}
