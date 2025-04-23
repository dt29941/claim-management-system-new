package com.model;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name="employee")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="phone_number",nullable = false)
    private String phoneNumber;



}