package com.springboot.controller;

import com.springboot.api.IProfileService;
import com.springboot.api.Profile;
import com.springboot.api.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @RequestMapping(path="/{id}/{firstName}/{lastName}/{role}", method = RequestMethod.PUT)
    public void setProfile(@PathVariable("id") int id, 
                           @PathVariable("firstName") String firstName, 
                           @PathVariable("lastName") String lastName, 
                           @PathVariable("role") Role role) {
        this.profileService.setProfile(new Profile(id, firstName, lastName, role));
    }
    
}
