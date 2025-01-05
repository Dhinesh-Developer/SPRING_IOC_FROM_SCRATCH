package com.kumar.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getWelcomeMessage() {
        return "This is a message from the Service Layer.";
    }
}
