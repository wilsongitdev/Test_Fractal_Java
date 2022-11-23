package com.example.TecnicalTestJava.web.controller;

import com.example.TecnicalTestJava.domain.ProductD;
import com.example.TecnicalTestJava.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<ProductD> getAll(){
        return productService.getListAllProduct();
    }

    @GetMapping("/{id}")
    public Optional<ProductD> getOrderById(@PathVariable("id") int productdId){
        return productService.getProductById(productdId);
    }

    @PostMapping("/add")
    public ProductD save(ProductD productD){
        return productService.save(productD);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int productdId){
        return productService.delete(productdId);
    }

}
