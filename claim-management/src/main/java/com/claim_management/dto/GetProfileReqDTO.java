package com.claim_management.dto;

import java.util.Date;

public class GetProfileReqDTO {


    private String name;

    public GetProfileReqDTO(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                ", name='" + name + '\'' +
                '}';
    }
}
