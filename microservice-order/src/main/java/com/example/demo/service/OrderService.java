package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order create(Order order);

    Order update(Order order);

    void delete(Integer id);
}
