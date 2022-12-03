package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.dto.OrderD;
import com.example.TecnicalTestJava.persistence.entity.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses ={OrderProductMapper.class})
public interface OrderMapper {
    @Mappings({
            @Mapping(source = "idOrder", target = "idOrderD"),
            @Mapping(source = "numOrder", target = "numOrderD"),
            @Mapping(source = "date", target = "dateD"),
            @Mapping(source = "items",target = "products"),
            @Mapping(source = "numProducts", target = "numProductsD"),
            @Mapping(source = "finalPrice", target = "finalPriceD")
    })
    OrderD toOrderD(Order order);

    List<OrderD> toOrdersD(List<Order> orders);


    @InheritInverseConfiguration //hace la conversión inversa de la configuración sin poner de nuevo mappings
    Order toOrder(OrderD orderD);

}
