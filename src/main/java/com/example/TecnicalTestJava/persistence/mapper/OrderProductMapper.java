package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.OrderProductD;
import com.example.TecnicalTestJava.persistence.entity.OrderProduct;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface OrderProductMapper {


    @Mapping(source = "id.idProduct", target = "productId")
    OrderProductD toOrderProductD(OrderProduct item);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id.idOrder", ignore = true),
            @Mapping(target = "order", ignore = true),
            @Mapping(target = "product", ignore = true),

    })
    OrderProduct toOrderProduct(OrderProductD item);
}
