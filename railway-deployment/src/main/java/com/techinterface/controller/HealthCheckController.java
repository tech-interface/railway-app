package com.techinterface.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);


    @GetMapping("/status")
    public String welcome() {
        return "App is deployed ";
    }
}

