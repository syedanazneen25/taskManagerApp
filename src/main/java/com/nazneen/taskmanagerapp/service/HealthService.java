package com.nazneen.taskmanagerapp.service;

import org.springframework.stereotype.Service;


@Service
public class HealthService {
    public String getStatus (){
        return "Backend service is Running";
    }

    public String getAppName() {
        return "Task Manager App";
    }
}
