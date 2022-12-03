package com.example.TecnicalTestJava.domain.service;

import com.example.TecnicalTestJava.domain.dto.OrderProductD;
import com.example.TecnicalTestJava.domain.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderProductService {

    @Autowired
    public OrderProductRepository orderProductRepository;

    public List<OrderProductD> getAll() {

        return orderProductRepository.getAll();
    }

    public Optional<OrderProductD> findById(int id) {
        return Optional.empty();
    }

    public OrderProductD save(OrderProductD orderd) {
        return null;
    }

    public void delete(OrderProductD orderd) {

    }

    public void deleteById(int idOrderd) {

    }
}
