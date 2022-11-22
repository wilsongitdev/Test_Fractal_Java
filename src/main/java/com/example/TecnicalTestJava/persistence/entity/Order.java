package com.example.TecnicalTestJava.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer idOrder;

    private Integer numOrder;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    private Date date;

    private Integer numProducts;

    private BigDecimal finalPrice;

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

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

}
