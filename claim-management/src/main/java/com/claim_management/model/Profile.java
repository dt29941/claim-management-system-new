package com.claim_management.model;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name="employee")
public class Profile{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="name", nullable = false)
    private String username;

    @Column(name="email",nullable = false)
    private String email;


    @Column(name="phoneNumber",nullable = false)
    private String phoneNumber;

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



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}