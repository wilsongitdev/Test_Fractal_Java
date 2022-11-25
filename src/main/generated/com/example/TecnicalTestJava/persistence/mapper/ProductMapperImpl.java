package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.ProductD;
import com.example.TecnicalTestJava.persistence.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-25T08:37:11-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductD toProductD(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductD productD = new ProductD();

        productD.setIdProductD( product.getIdProduct() );
        productD.setNameD( product.getName() );
        productD.setUnitPriceD( product.getUnitPrice() );
        productD.setQuantityD( product.getQuantity() );

        return productD;
    }

    @Override
    public Product toProduct(ProductD productD) {
        if ( productD == null ) {
            return null;
        }

        Product product = new Product();

        product.setIdProduct( productD.getIdProductD() );
        product.setName( productD.getNameD() );
        product.setUnitPrice( productD.getUnitPriceD() );
        product.setQuantity( productD.getQuantityD() );

        return product;
    }

    @Override
    public List<ProductD> toProductsD(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductD> list = new ArrayList<ProductD>( products.size() );
        for ( Product product : products ) {
            list.add( toProductD( product ) );
        }

        return list;
    }

    @Override
    public List<Product> toProducts(List<ProductD> productsD) {
        if ( productsD == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productsD.size() );
        for ( ProductD productD : productsD ) {
            list.add( toProduct( productD ) );
        }

        return list;
    }
}
