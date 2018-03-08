package com.lying.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @Value("${info.message}")
    private String message;

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    public String print() {
        return message;
    }
}
