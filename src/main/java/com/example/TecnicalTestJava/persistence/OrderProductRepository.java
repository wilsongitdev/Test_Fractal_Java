package com.example.TecnicalTestJava.persistence;

import com.example.TecnicalTestJava.domain.dto.OrderProductD;
import com.example.TecnicalTestJava.persistence.crud.OrderProductCrudRepository;
import com.example.TecnicalTestJava.persistence.entity.OrderProduct;
import com.example.TecnicalTestJava.persistence.mapper.OrderProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderProductRepository implements com.example.TecnicalTestJava.domain.repository.OrderProductRepository {

    private OrderProductMapper orderProductMapper;
    private OrderProductCrudRepository orderProductCrudRepository;
    @Override
    public List<OrderProductD> getAll() {
        return orderProductMapper.toOrdersDProduct((List<OrderProduct>) orderProductCrudRepository.findAll());
    }

    @Override
    public Optional<OrderProductD> findById(int id) {
        return Optional.empty();
    }

    @Override
    public OrderProductD save(OrderProductD orderd) {
        return null;
    }

    @Override
    public void delete(OrderProductD orderd) {

    }

    @Override
    public void deleteById(int idOrderd) {

    }
}
