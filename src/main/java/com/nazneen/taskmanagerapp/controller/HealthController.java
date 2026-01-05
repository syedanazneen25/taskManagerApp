package com.nazneen.taskmanagerapp.controller;

import com.nazneen.taskmanagerapp.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {
    private final HealthService healthservice;
    public HealthController(HealthService healthservice){
        this.healthservice = healthservice;
    }
    @GetMapping("/health")
    public String health() {
        return healthservice.getStatus();

    }
    @GetMapping("/name")
    public String name(){
        return healthservice.getAppName();
    }


}


