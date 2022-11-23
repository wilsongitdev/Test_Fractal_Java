package com.example.TecnicalTestJava.web.controller;


import com.example.TecnicalTestJava.domain.OrderD;

import com.example.TecnicalTestJava.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public List<OrderD> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<OrderD> getOrderById(@PathVariable("id") int orderdId){
        return orderService.getOrderById(orderdId);
    }

    @PostMapping("/add")
    public OrderD save(OrderD orderD){
        return orderService.save(orderD);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int orderdId){
        return orderService.delete(orderdId);
    }

}
