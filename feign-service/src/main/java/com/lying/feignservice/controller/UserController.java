package com.lying.feignservice.controller;

import com.lying.feignservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo/{name}", method = RequestMethod.GET)
    public String getUserInfo(@PathVariable("name") String name) {
        return userService.fetchUserAndPort(name);
    }
}
