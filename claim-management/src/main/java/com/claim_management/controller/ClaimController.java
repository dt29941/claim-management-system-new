package com.claim_management.controller;

import com.claim_management.dto.GetEmployeeReqDTO;
import com.claim_management.dto.GetEmployeeResDTO;
import com.claim_management.repository.ClaimRepository;
import com.claim_management.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claim-api")
public class ClaimController {

    @Autowired
    ClaimService claimService;

    @Autowired
    ClaimRepository claimRepository;

    @GetMapping("/getEmployee")
    public GetEmployeeResDTO getEmployee(@RequestBody GetEmployeeReqDTO getEmployeeReqDTO){
        var employeeId = getEmployeeReqDTO.getEmployeeId();
        return claimService.getEmployee(employeeId);

    }
}
