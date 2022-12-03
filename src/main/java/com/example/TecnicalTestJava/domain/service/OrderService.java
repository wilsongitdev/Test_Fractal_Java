package com.example.TecnicalTestJava.domain.service;

import com.example.TecnicalTestJava.domain.dto.OrderD;
import com.example.TecnicalTestJava.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    public OrderRepository orderRepository;

    public List<OrderD> getAll(){
        return orderRepository.getAll();
    }

    public Optional<OrderD> getOrderById(int id){
        return orderRepository.findById(id);
    }
    public OrderD save(OrderD orderd){
        return orderRepository.save(orderd);
    }

    public boolean delete(int idOrderD){
        return orderRepository.findById(idOrderD).map((orderD -> {
            orderRepository.deleteById(idOrderD);
            return true;
        })).orElse(false);
    }

}
