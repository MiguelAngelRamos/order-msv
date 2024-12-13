package com.kibernumacademy.order.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.kibernumacademy.order.model.Order;
import com.kibernumacademy.order.repository.OrderRepository;

@Service
public class OrderService {
  
  private OrderRepository orderRepository;
  
  public OrderService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  public Order createOrder(Order order) {
    return orderRepository.save(order);
  }

  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }
}
