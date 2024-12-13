package com.kibernumacademy.order.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kibernumacademy.order.model.Order;
public interface OrderRepository extends JpaRepository<Order, Long>{
  
}
