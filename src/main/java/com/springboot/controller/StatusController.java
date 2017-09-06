package com.springboot.controller;

import com.springboot.api.Status;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/status", produces = "application/json")
public class StatusController {
    
    private final Status status;
    
    public StatusController() {
        this.status = new Status(LocalDateTime.now());
    }
    
    @RequestMapping(path="/app", method = RequestMethod.GET)
    public Status getAppStatus() {
        this.status.setRequestTime(LocalDateTime.now());
        return this.status;
    }
    
}
