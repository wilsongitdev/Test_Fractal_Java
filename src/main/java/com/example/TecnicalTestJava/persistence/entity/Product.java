package com.example.TecnicalTestJava.persistence.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "product", uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;

    @NotNull
    private String name;

    @Column(name = "unitprice")
    private Double unitPrice;

    @Column(name = "qty")
    private int quantity;


    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
