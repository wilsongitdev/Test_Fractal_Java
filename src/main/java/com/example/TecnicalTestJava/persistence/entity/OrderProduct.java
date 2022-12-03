package com.example.TecnicalTestJava.persistence.entity;

import javax.persistence.*;

@Entity(name = "order_product")
public class OrderProduct {
    @EmbeddedId
    private OrderProductPK id;

    @ManyToOne
    @MapsId("idOrder")
    @JoinColumn(name = "id_order", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;



    @Column(name = "quantity_buy")
    private Integer quantityBuy;

    @Column(name = "total_buy")
    private Double totalBuy;

    public OrderProductPK getId() {
        return id;
    }

    public void setId(OrderProductPK id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(Integer quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public Double getTotalBuy() {
        return totalBuy;
    }

    public void setTotalBuy(Double totalBuy) {
        this.totalBuy = totalBuy;
    }
}
