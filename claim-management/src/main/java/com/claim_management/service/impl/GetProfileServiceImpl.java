package com.claim_management.service.impl;

import com.claim_management.dto.GetProfileResDTO;
import com.claim_management.repository.GetProfileRepository;
import com.claim_management.service.GetProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetProfileServiceImpl implements GetProfileService {

    @Autowired
    GetProfileRepository getProfileRepository;


    @Override
    public GetProfileResDTO getProfileData(String username){
        System.out.println("getprofileDATA");
        return getProfileRepository.getProfileByUser(username).orElse(null);
    }





}
