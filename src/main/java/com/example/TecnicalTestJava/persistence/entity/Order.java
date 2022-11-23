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
    private int idOrder;

    @Column(name = "num_order")
    private int numOrder;



    private Date date;

    @OneToMany(mappedBy = "product")
    private List<OrderProduct> products;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
