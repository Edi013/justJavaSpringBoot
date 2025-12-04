package com.rest.RestServices.models;

import jakarta.annotation.PostConstruct;

public class ErrorDetails {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @PostConstruct
    public void TestPostConstruct(){
        System.out.println("ErrorDetails created ");
    }
}
