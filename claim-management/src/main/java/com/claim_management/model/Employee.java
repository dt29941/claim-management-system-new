package com.claim_management.model;

import jakarta.persistence.*;
import java.util.Date;
@Entity

@Table(name="employee")
public class Employee{
    @OneToOne(mappedBy = "employee")
    private Department department;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="phoneNumber",nullable = false)
    private String phoneNumber;

    @Column(name="role",nullable = false)
    private String role;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Column(name="hire_date",nullable = false)
    private String hireDate;

    @Column(name="departmentId",nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}