package com.cognizant.createauthentication.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.createauthentication.model.AuthenticationResponse;
import com.cognizant.createauthentication.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String authorizationHeader) {

        String base64Credentials = authorizationHeader.substring("Basic ".length());

        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if (username.equals("user") && password.equals("pwd")) {

            String token = JwtUtil.generateToken(username);

            return new AuthenticationResponse(token);
        }

        throw new RuntimeException("Invalid Credentials");
    }
}