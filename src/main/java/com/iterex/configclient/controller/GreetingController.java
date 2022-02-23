package com.iterex.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${my.password}")
    private String password;

    @GetMapping(value = "/greeting")
    public String greet() {

        return String.format("This from vault %s", password);
    }
}
