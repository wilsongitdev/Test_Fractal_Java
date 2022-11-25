package com.example.TecnicalTestJava.persistence.mapper;

import com.example.TecnicalTestJava.domain.OrderProductD;
import com.example.TecnicalTestJava.persistence.entity.OrderProduct;
import com.example.TecnicalTestJava.persistence.entity.OrderProductPK;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-25T08:37:11-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class OrderProductMapperImpl implements OrderProductMapper {

    @Override
    public OrderProductD toOrderProductD(OrderProduct item) {
        if ( item == null ) {
            return null;
        }

        OrderProductD orderProductD = new OrderProductD();

        Integer idProduct = itemIdIdProduct( item );
        if ( idProduct != null ) {
            orderProductD.setProductId( idProduct );
        }
        orderProductD.setStateOrder( item.getStateOrder() );
        orderProductD.setQuantityBuy( item.getQuantityBuy() );
        orderProductD.setTotalBuy( item.getTotalBuy() );

        return orderProductD;
    }

    @Override
    public OrderProduct toOrderProduct(OrderProductD item) {
        if ( item == null ) {
            return null;
        }

        OrderProduct orderProduct = new OrderProduct();

        orderProduct.setId( orderProductDToOrderProductPK( item ) );
        orderProduct.setStateOrder( item.getStateOrder() );
        orderProduct.setQuantityBuy( item.getQuantityBuy() );
        orderProduct.setTotalBuy( item.getTotalBuy() );

        return orderProduct;
    }

    private Integer itemIdIdProduct(OrderProduct orderProduct) {
        if ( orderProduct == null ) {
            return null;
        }
        OrderProductPK id = orderProduct.getId();
        if ( id == null ) {
            return null;
        }
        Integer idProduct = id.getIdProduct();
        if ( idProduct == null ) {
            return null;
        }
        return idProduct;
    }

    protected OrderProductPK orderProductDToOrderProductPK(OrderProductD orderProductD) {
        if ( orderProductD == null ) {
            return null;
        }

        OrderProductPK orderProductPK = new OrderProductPK();

        orderProductPK.setIdProduct( orderProductD.getProductId() );

        return orderProductPK;
    }
}
