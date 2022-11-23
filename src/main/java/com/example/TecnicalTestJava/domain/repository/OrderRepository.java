package com.example.TecnicalTestJava.domain.repository;

import com.example.TecnicalTestJava.domain.OrderD;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    List<OrderD> getAll();
    Optional<OrderD> findById(int id);
    OrderD save(OrderD orderd);
    void delete(OrderD orderd);
    void deleteById(int idOrderd);

}
