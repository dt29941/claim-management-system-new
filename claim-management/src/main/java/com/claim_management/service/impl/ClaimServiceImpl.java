package com.claim_management.service.impl;

import com.claim_management.dto.GetEmployeeResDTO;
import com.claim_management.repository.ClaimRepository;
import com.claim_management.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimServiceImpl implements ClaimService {
    @Autowired
    ClaimRepository claimRepository;


    @Override
    public GetEmployeeResDTO getEmployee(int employeeId) {

        return claimRepository.getEmployee(employeeId).orElse(null);
    }
}
