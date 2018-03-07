package com.lying.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client", fallback = UserServiceFallback.class)
public interface UserService {

    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
    String fetchUserAndPort(@PathVariable("name") String name);
}

@Component
class UserServiceFallback implements UserService {

    @Override
    public String fetchUserAndPort(String name) {
        return "feign fetch user error!";
    }
}