package com.kibernumacademy.order.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kibernumacademy.order.model.Order;
import com.kibernumacademy.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
  
  private OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public ResponseEntity<Order> createOrder(@RequestBody Order order) {
    return ResponseEntity.ok(orderService.createOrder(order));
  }

  @GetMapping
  public ResponseEntity<List<Order>> getAllOrders() {
    List<Order> order =  orderService.getAllOrders();
    return ResponseEntity.ok(order);
  }
  

}
