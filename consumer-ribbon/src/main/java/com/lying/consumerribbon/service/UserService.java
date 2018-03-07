package com.lying.consumerribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    public String getUserInfo(String name) {
        return restTemplate.getForObject("http://eureka-client/users/" + name, String.class);
    }
}
