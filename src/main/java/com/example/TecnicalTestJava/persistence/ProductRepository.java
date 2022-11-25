package com.example.TecnicalTestJava.persistence;

import com.example.TecnicalTestJava.domain.ProductD;
import com.example.TecnicalTestJava.persistence.crud.ProductCrudRepository;
import com.example.TecnicalTestJava.persistence.entity.Product;
import com.example.TecnicalTestJava.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //interactua con la bd
public class ProductRepository implements com.example.TecnicalTestJava.domain.repository.ProductRepository {
    /***
     * Enlaza los métodos de ProductCrudRepository con ProductRepository usando los métodos
     * definidos en los mappers
     */
    @Autowired
    private ProductCrudRepository productCrudRepository;
    @Autowired
    private ProductMapper mapper;

    //se quiere retornar todos los productos de una lista
    public List<ProductD> getAll(){

        List<Product> listProducts = (List<Product>) productCrudRepository.findAll();

        return mapper.toProductsD(listProducts);
    }

    @Override
    public List<ProductD> getNotEmpty() {
        List<Product> productsnotempty = productCrudRepository.notEmptyProducts();
        return mapper.toProductsD(productsnotempty);
    }

    @Override
    public Optional<ProductD> getById(Integer id) {
        Optional<Product> productsById = productCrudRepository.findById(id);
        return productsById.map(product -> mapper.toProductD(product));
    }


    @Override
    public ProductD save(ProductD productD) {
        Product product = mapper.toProduct(productD);
        return mapper.toProductD(productCrudRepository.save(product));
    }
    @Override
    public ProductD update(ProductD productD) {
        Product product = mapper.toProduct(productD);
        return mapper.toProductD(productCrudRepository.save(product));
    }

    public void delete(int idProduct){
        productCrudRepository.deleteById(idProduct);
    }
}
