package com.example.TecnicalTestJava.persistence;

import com.example.TecnicalTestJava.persistence.crud.OrderCrudRepository;
import com.example.TecnicalTestJava.persistence.crud.ProductCrudRepository;
import com.example.TecnicalTestJava.persistence.entity.Order;
import com.example.TecnicalTestJava.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //interactua con la bd
public class ProductoRepository {
    private ProductCrudRepository productCrudRepository;


    //se quiere retornar todos los productos de una lista
    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
    public List<Product> getEmpty(Integer id){
        return  productCrudRepository.emptyproducts();
    }
    public Optional<Product> getById(Integer id){
        return productCrudRepository.findById(id);
    }
    public Product save(Product producto){
        return productCrudRepository.save(producto);
    }
    public void delete(int idProducto){
        productCrudRepository.deleteById(idProducto);
    }
}
