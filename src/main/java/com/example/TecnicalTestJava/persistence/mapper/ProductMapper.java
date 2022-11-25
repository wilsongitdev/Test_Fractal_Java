package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.ProductD;
import com.example.TecnicalTestJava.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct", target = "idProductD"),
            @Mapping(source = "name", target = "nameD"),
            @Mapping(source = "unitPrice", target = "unitPriceD"),
            @Mapping(source = "quantity", target = "quantityD")
    })
    ProductD toProductD(Product product);

    @InheritInverseConfiguration
    Product toProduct(ProductD productD);

    List<ProductD> toProductsD(List<Product> products);
    List<Product> toProducts(List<ProductD> productsD);

}
