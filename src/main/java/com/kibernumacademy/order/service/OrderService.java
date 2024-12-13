package com.kibernumacademy.order.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibernumacademy.order.client.User;
import com.kibernumacademy.order.model.Order;
import com.kibernumacademy.order.repository.OrderRepository;

@Service
public class OrderService {

  private OrderRepository orderRepository;
  private IUserServiceClient userServiceClient;

  public OrderService(OrderRepository orderRepository, IUserServiceClient userServiceClient) {
    this.orderRepository = orderRepository;
    this.userServiceClient = userServiceClient;
  }

  public Order createOrder(Order order) {
  
    User user = userServiceClient.getUserById(order.getUserId());

    if(user.getId() == -1L) {
      throw new RuntimeException("Usuaro no encontrado");
    }
    return orderRepository.save(order);
  }

  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }
}
