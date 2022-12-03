package com.example.TecnicalTestJava.web.controller;


import com.example.TecnicalTestJava.domain.dto.OrderD;

import com.example.TecnicalTestJava.domain.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<OrderD>> getAll(){
        System.out.println("getAll");
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderD> getOrderById(@PathVariable("id") int orderdId){

        return orderService.getOrderById(orderdId).map(orderD ->new ResponseEntity<>(orderD,HttpStatus.OK)).
                orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<OrderD> save(@RequestBody OrderD orderD){
        return new ResponseEntity<>(orderService.save(orderD), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<OrderD> update(@RequestBody OrderD orderD){

        if (orderService.getOrderById(orderD.getIdOrderD()).isPresent()){
            return new ResponseEntity<>(orderService.save(orderD), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int orderdId){
        if (orderService.delete(orderdId)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
