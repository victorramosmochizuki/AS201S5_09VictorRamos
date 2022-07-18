package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    List<Order> findAll(){
        return orderService.findAll();
    }

    @PostMapping
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @PutMapping
    public Order update(@RequestBody Order order){
        return orderService.update(order);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        orderService.delete(id);
    }
}
