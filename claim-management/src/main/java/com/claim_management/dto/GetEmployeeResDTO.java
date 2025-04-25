package com.claim_management.dto;

import java.io.Serializable;

public class GetEmployeeResDTO implements Serializable {
    private int employeeId;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private int departmentId;
    private String departmentName;


    public GetEmployeeResDTO(int employeeId, String employeeName, String email, String phoneNumber, int departmentId, String departmentName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + employeeId +
                ", name='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", departmentName='" +  departmentName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
