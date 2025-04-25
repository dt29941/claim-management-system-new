package com.claim_management.dto;

public class GetEmployeeReqDTO{
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private int employeeId;

    GetEmployeeReqDTO(int employeeId){
        this.employeeId = employeeId;
    }

}
