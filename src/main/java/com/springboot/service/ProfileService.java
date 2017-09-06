package com.springboot.service;

import com.springboot.api.IProfileService;
import com.springboot.api.Profile;
import static com.springboot.api.Role.NOT_SET;
import org.springframework.stereotype.Service;

@Service
public class ProfileService implements IProfileService {

    private Profile profile;
    
    public ProfileService() {
        this.profile = new Profile(0, "test", "test", NOT_SET);
    }
    
    @Override
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public Profile getProfile() {
        return this.profile;
    }
    
}
