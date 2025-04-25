package com.claim_management.dto;

import java.io.Serializable;
import java.util.Date;

public class GetProfileDTO implements Serializable {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private String role;
    private Integer departmentId;

    // Default constructor
    public GetProfileDTO() {}

    // Parameterized constructor
    public GetProfileDTO(int id, String name, String email, String phoneNumber, Date hireDate, String role, Integer departmentId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.role = role;
        this.departmentId = departmentId;

    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", role='" + role + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}