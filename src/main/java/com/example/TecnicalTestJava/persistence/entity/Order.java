package com.example.TecnicalTestJava.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer idOrder;

    @Column(name = "num_order")
    private Integer numOrder;

    @Column(name = "state")
    private Integer orderState;
    private Date date;



    @OneToMany(mappedBy = "order",cascade = {CascadeType.ALL})
    private List<OrderProduct> items;

    @Column(name = "num_Products")
    private Integer numProducts;

    @Column(name="final_price")
    private Double finalPrice;


    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getNumOrder() {
        return numOrder;
    }

    public void setNumOrder(Integer numOrder) {
        this.numOrder = numOrder;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderProduct> getItems() {
        return items;
    }

    public void setItems(List<OrderProduct> items) {
        this.items = items;
    }

    public Integer getNumProducts() {
        return numProducts;
    }

    public void setNumProducts(Integer numProducts) {
        this.numProducts = numProducts;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }
}
