package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.dto.OrderD;
import com.example.TecnicalTestJava.persistence.entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T03:50:57-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private OrderProductMapper orderProductMapper;

    @Override
    public OrderD toOrderD(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderD orderD = new OrderD();

        orderD.setIdOrderD( order.getIdOrder() );
        orderD.setNumOrderD( order.getNumOrder() );
        orderD.setDateD( order.getDate() );
        orderD.setProducts( orderProductMapper.toOrdersDProduct( order.getItems() ) );
        orderD.setNumProductsD( order.getNumProducts() );
        orderD.setFinalPriceD( order.getFinalPrice() );
        orderD.setOrderState( order.getOrderState() );

        return orderD;
    }

    @Override
    public List<OrderD> toOrdersD(List<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        List<OrderD> list = new ArrayList<OrderD>( orders.size() );
        for ( Order order : orders ) {
            list.add( toOrderD( order ) );
        }

        return list;
    }

    @Override
    public Order toOrder(OrderD orderD) {
        if ( orderD == null ) {
            return null;
        }

        Order order = new Order();

        order.setIdOrder( orderD.getIdOrderD() );
        order.setNumOrder( orderD.getNumOrderD() );
        order.setDate( orderD.getDateD() );
        order.setItems( orderProductMapper.toOrdersProduct( orderD.getProducts() ) );
        order.setNumProducts( orderD.getNumProductsD() );
        order.setFinalPrice( orderD.getFinalPriceD() );
        order.setOrderState( orderD.getOrderState() );

        return order;
    }
}
