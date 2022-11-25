package com.example.TecnicalTestJava.persistence;

import com.example.TecnicalTestJava.domain.OrderD;
import com.example.TecnicalTestJava.persistence.crud.OrderCrudRepository;
import com.example.TecnicalTestJava.persistence.entity.Order;
import com.example.TecnicalTestJava.persistence.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository implements com.example.TecnicalTestJava.domain.repository.OrderRepository {
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    @Autowired
    private OrderMapper orderMapper;

    public List<OrderD> getAll(){
        return orderMapper.toOrdersD((List<Order>) orderCrudRepository.findAll());
    }



    @Override
    public Optional<OrderD> findById(int id) {
        return orderCrudRepository.findById(id).map(order -> orderMapper.toOrderD(order));
    }

    @Override
    public OrderD save(OrderD orderd) {
        System.out.println(orderd.getProducts());
        Order order = orderMapper.toOrder(orderd);
        order.getItems().forEach(orderProduct -> orderProduct.setOrder(order));
        return orderMapper.toOrderD(orderCrudRepository.save(order));
    }

    public OrderD update(OrderD orderd) {

        Order order = orderMapper.toOrder(orderd);
        orderCrudRepository.deleteById(orderd.getIdOrderD());
        order.getItems().forEach(orderProduct -> {
            orderProduct.setOrder(order);
            System.out.println(orderProduct.getId());
        });
        return orderMapper.toOrderD(orderCrudRepository.save(order));
    }


    @Override
    public void delete(OrderD orderd) {
        orderCrudRepository.delete(orderMapper.toOrder(orderd));
    }

    public void deleteById(int idOrder) {orderCrudRepository.deleteById(idOrder);}
}
