package com.example.TecnicalTestJava.persistence.crud;

import com.example.TecnicalTestJava.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
    @Query(value = "Select * from PRODUCT WHERE QTY !=0", nativeQuery = true)
    List<Product> notEmptyProducts();
}
