package com.claim_management.controller;

import com.claim_management.model.LoginRequest;
import com.claim_management.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.claim_management.service.LoginService;
@RestController
@RequestMapping("/api")
public class LoginController{
    @Autowired
    LoginRepository loginRepository;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginRequest loginRequest){
        String username = loginRequest.getUsername();
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();
        System.out.println(username);

        boolean isAuthenticated = loginService.authenticate(username, password);
        if (isAuthenticated) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";

        }
    }

    }
