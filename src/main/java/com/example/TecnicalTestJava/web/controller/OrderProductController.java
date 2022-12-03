package com.example.TecnicalTestJava.web.controller;

import com.example.TecnicalTestJava.domain.dto.OrderProductD;
import com.example.TecnicalTestJava.domain.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderproduct")
public class OrderProductController {
    @Autowired
    OrderProductService orderProductService;

    @GetMapping("/all")
    public ResponseEntity<List<OrderProductD>> getAll(){
        return new ResponseEntity<>(orderProductService.getAll(), HttpStatus.OK);
    }
}
