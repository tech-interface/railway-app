package com.techinterface.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping("/railway-app/health")
public class HealthCheckController {

    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);


    @GetMapping("/status")
    public String welcome() {
        return "App is deployed and running  ";
    }
}

