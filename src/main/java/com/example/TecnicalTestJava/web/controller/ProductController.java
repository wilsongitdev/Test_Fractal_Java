package com.example.TecnicalTestJava.web.controller;

import com.example.TecnicalTestJava.domain.dto.ProductD;
import com.example.TecnicalTestJava.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<ProductD>> getAll(){
        return new ResponseEntity<>(productService.getListAllProduct(), HttpStatus.OK);
    }
    @GetMapping("/available/all")
    public ResponseEntity<List<ProductD>> getAllEmpty(){
        return new ResponseEntity<>(productService.getAvailableProduct(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductD> getOrderById(@PathVariable("id") int productdId){
        return productService.getProductById(productdId).
                map(order -> new ResponseEntity<>(order, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<ProductD> save(@RequestBody ProductD productD){
        return new ResponseEntity<>(productService.save(productD), HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody ProductD productD){
        if (productService.getProductById(productD.getIdProductD()).isPresent()){
            productService.save(productD);
            return new ResponseEntity<>("The product was updated succesfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("The Product was not found",HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int productdId){
        if (productService.delete(productdId)){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
