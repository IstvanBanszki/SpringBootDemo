package com.springboot.controller;

import com.springboot.api.IProfileService;
import com.springboot.api.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/profile", produces = "application/json")
public class ProfileController {
    
    @Autowired
    private IProfileService profileService;
    
    @RequestMapping(method = RequestMethod.GET)
    public Profile getProfile() {
        return this.profileService.getProfile();
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void setProfile(Profile profile) {
        this.profileService.setProfile(profile);
    }
    
}
