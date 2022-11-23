package com.example.TecnicalTestJava.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "order_product")
public class OrderProduct {
    @EmbeddedId
    private OrderProductPK id;

    @ManyToOne
    @JoinColumn(name = "id_order", insertable = false, updatable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Product product;
    private Boolean state;

    public OrderProductPK getId() {
        return id;
    }

    public void setId(OrderProductPK id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
