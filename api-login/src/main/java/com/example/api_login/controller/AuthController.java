package com.example.api_login.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.api_login.model.login.LoginRequest;
import com.example.api_login.model.login.LoginResponse;

import lombok.RequiredArgsConstructor;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
public class AuthController {

    @PostMapping("/auth/login")
    public LoginResponse login(@RequestBody @Validated LoginRequest request) {
        // TODO: process POST request

        return LoginResponse.builder()
                .accessToken("teste")
                .build();
    }

}
