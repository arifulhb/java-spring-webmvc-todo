package com.arifulhaque.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements IService {

    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this demo application";
    }
}
