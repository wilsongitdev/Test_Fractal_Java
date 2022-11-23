package com.example.TecnicalTestJava.persistence.crud;

import com.example.TecnicalTestJava.persistence.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderCrudRepository extends CrudRepository<Order,Integer> {

}
