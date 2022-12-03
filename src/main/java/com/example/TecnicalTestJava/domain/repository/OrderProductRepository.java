package com.example.TecnicalTestJava.domain.repository;


import com.example.TecnicalTestJava.domain.dto.OrderProductD;

import java.util.List;
import java.util.Optional;

public interface OrderProductRepository {

    List<OrderProductD> getAll();
    Optional<OrderProductD> findById(int id);
    OrderProductD save(OrderProductD orderd);
    void delete(OrderProductD orderd);
    void deleteById(int idOrderd);
}
