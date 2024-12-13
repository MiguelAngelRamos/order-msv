package com.kibernumacademy.order.client;

import org.springframework.stereotype.Component;

import com.kibernumacademy.order.service.IUserServiceClient;

@Component
public class UserServiceFallback implements IUserServiceClient{

  @Override
  public User getUserById(Long id) {
    User fallbackUser = new User();
    fallbackUser.setId(-1L);
    fallbackUser.setName("Desconocido");
    fallbackUser.setEmail("desconocido@correo.com");

    return fallbackUser;
  }

  
}
