package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.OrderD;
import com.example.TecnicalTestJava.persistence.entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-23T16:52:39-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderD toOrderD(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderD orderD = new OrderD();

        if ( order.getIdOrder() != null ) {
            orderD.setIdOrderD( order.getIdOrder() );
        }
        if ( order.getNumOrder() != null ) {
            orderD.setNumOrderD( order.getNumOrder() );
        }
        orderD.setDateD( order.getDate() );
        orderD.setNumProductsD( order.getNumProducts() );
        orderD.setFinalPriceD( order.getFinalPrice() );

        return orderD;
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
        order.setNumProducts( orderD.getNumProductsD() );
        order.setFinalPrice( orderD.getFinalPriceD() );

        return order;
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
    public List<Order> toOrders(List<OrderD> ordersD) {
        if ( ordersD == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( ordersD.size() );
        for ( OrderD orderD : ordersD ) {
            list.add( toOrder( orderD ) );
        }

        return list;
    }
}
