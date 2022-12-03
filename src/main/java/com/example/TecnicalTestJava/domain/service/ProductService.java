package com.example.TecnicalTestJava.domain.service;

import com.example.TecnicalTestJava.domain.dto.ProductD;
import com.example.TecnicalTestJava.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductD> getListAllProduct(){
        return productRepository.getAll();
    }

    public List<ProductD> getAvailableProduct(){
        return productRepository.getNotEmpty();
    }

    public Optional<ProductD> getProductById(int id){
        return productRepository.getById(id);
    }

    public ProductD save(ProductD productD){
        return productRepository.save(productD);
    }

    public boolean delete(int idProduct){
        return getProductById(idProduct).map(productD -> {
            productRepository.delete(idProduct);
            return true;
        }).orElse(false);
    }
}
