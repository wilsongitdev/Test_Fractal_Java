package com.example.TecnicalTestJava.persistence.crud;


import com.example.TecnicalTestJava.persistence.entity.OrderProduct;
import com.example.TecnicalTestJava.persistence.entity.OrderProductPK;
import com.example.TecnicalTestJava.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderProductCrudRepository extends CrudRepository<OrderProduct, OrderProductPK> {
    @Query(value = "Select * from ORDER_PRODUCT", nativeQuery = true)
    List<OrderProduct> getAllOrderProduct();
}
