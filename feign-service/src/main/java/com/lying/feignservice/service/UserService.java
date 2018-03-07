package com.lying.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
public interface UserService {

    @RequestMapping(value = "/users/{name}", method = RequestMethod.GET)
    String fetchUserAndPort(@PathVariable("name") String name);
}
