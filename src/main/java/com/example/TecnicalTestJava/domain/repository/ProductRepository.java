package com.example.TecnicalTestJava.domain.repository;

import com.example.TecnicalTestJava.domain.ProductD;
import com.example.TecnicalTestJava.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductD> getAll();
    List<ProductD> getNotEmpty();
    Optional<ProductD> getById(Integer id);
    ProductD save(ProductD productD);

    ProductD update(ProductD productD);
    void delete(int idProduct);
}
