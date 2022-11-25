package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.OrderD;
import com.example.TecnicalTestJava.domain.OrderProductD;
import com.example.TecnicalTestJava.persistence.entity.Order;
import com.example.TecnicalTestJava.persistence.entity.OrderProduct;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-25T08:37:11-0500",
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
        orderD.setProducts( orderProductListToOrderProductDList( order.getItems() ) );
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
        order.setItems( orderProductDListToOrderProductList( orderD.getProducts() ) );
        order.setNumProducts( orderD.getNumProductsD() );
        order.setFinalPrice( orderD.getFinalPriceD() );
        order.setOrderState( orderD.getOrderState() );

        return order;
    }

    protected List<OrderProductD> orderProductListToOrderProductDList(List<OrderProduct> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderProductD> list1 = new ArrayList<OrderProductD>( list.size() );
        for ( OrderProduct orderProduct : list ) {
            list1.add( orderProductMapper.toOrderProductD( orderProduct ) );
        }

        return list1;
    }

    protected List<OrderProduct> orderProductDListToOrderProductList(List<OrderProductD> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderProduct> list1 = new ArrayList<OrderProduct>( list.size() );
        for ( OrderProductD orderProductD : list ) {
            list1.add( orderProductMapper.toOrderProduct( orderProductD ) );
        }

        return list1;
    }
}
