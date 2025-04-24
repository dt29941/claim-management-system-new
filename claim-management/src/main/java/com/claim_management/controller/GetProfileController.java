package com.claim_management.controller;


import com.claim_management.dto.GetProfileDTO;
import com.claim_management.model.GetProfileRequest;
import com.claim_management.repository.GetProfileRepository;
import com.claim_management.service.GetProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile-api")
public class GetProfileController {

    @Autowired
    GetProfileRepository getProfileRepository;

    @Autowired
    GetProfileService getProfileService;

    @GetMapping("/getProfile")
    public GetProfileDTO getProfile(@RequestBody GetProfileRequest getProfileRequest){
            var username = getProfileRequest.getUsername();
            System.out.println(username);
            return getProfileService.getProfileData(username);


    }

}
