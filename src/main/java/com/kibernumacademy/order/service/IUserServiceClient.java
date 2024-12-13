package com.kibernumacademy.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kibernumacademy.order.client.User;
import com.kibernumacademy.order.client.UserServiceFallback;

@FeignClient(name="user-service", fallback=UserServiceFallback.class)
public interface IUserServiceClient {

  @GetMapping("/users/{id}") 
  User getUserById(@PathVariable("id") Long id); 
}