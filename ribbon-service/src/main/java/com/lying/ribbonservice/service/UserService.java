package com.lying.ribbonservice.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUserInfoError")
    public String getUserInfo(String name) {
        return restTemplate.getForObject("http://eureka-client/users/" + name, String.class);
    }

    public String getUserInfoError(String name){
        return "ribbon get user error!";
    }
}
