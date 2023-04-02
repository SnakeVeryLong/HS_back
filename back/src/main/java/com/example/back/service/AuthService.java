package com.example.back.service;

import com.example.back.web.dto.auth.JwtRequest;
import com.example.back.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;


public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
