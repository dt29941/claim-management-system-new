package com.claim_management.service.impl;

import com.claim_management.model.Employee;
import com.claim_management.repository.LoginRepository;
import com.claim_management.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public boolean authenticate(String username, String password) {
        Optional<Employee> employeeOpt = loginRepository.findByName(username); // Use the instance method
        return employeeOpt.map(employee -> employee.getPassword().equals(password)).orElse(false);
    }
}