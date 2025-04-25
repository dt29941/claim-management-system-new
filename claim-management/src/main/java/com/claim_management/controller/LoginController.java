package com.claim_management.controller;

import com.claim_management.dto.LoginReqDTO;

import com.claim_management.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.claim_management.service.LoginService;
@RestController
@RequestMapping("/login-api")
public class LoginController{
    @Autowired
    LoginRepository loginRepository;

    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginReqDTO loginReqDTO){
        String username = loginReqDTO.getUsername();
        String email = loginReqDTO.getEmail();
        String password = loginReqDTO.getPassword();
        System.out.println(username);

        boolean isAuthenticated = loginService.authenticate(username, password);
        if (isAuthenticated) {
            return "Login successful!";
        } else {
            return "Invalid username or password.";

        }
    }

    }
