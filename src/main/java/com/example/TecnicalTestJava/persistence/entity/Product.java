package com.example.TecnicalTestJava.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idProduct;

    private Integer name;

    private Date unitprice;

    @Column(name = "qty")
    private Integer quantity;

    private BigDecimal totalPrice;

    public Integer getIdProduct() {
        return idProduct;
    }

    @OneToMany(mappedBy = "order")
    private List<Order> orders;

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Date getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Date unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
