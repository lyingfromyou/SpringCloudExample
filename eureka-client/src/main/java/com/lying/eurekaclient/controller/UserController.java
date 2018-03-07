package com.lying.eurekaclient.controller;

import com.lying.eurekaclient.orm.User;
import com.lying.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
    public String fetchUserByName(@PathVariable("name") String name) {
        User u = new User(null, name, null);

        return userService.findOne(Example.of(u)).toString() + ": " + port;
    }

}
