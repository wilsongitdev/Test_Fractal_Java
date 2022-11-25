package com.example.TecnicalTestJava.domain;

import java.util.Date;
import java.util.List;

public class OrderD {
    private Integer idOrderD;
    private Integer numOrderD;
    private Date dateD;

    private Integer numProductsD;
    private Double finalPriceD;

    private Integer orderState;

    private List<OrderProductD> products;

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getIdOrderD() {
        return idOrderD;
    }

    public void setIdOrderD(Integer idOrderD) {
        this.idOrderD = idOrderD;
    }

    public Integer getNumOrderD() {
        return numOrderD;
    }

    public void setNumOrderD(Integer numOrderD) {
        this.numOrderD = numOrderD;
    }

    public Date getDateD() {
        return dateD;
    }

    public void setDateD(Date dateD) {
        this.dateD = dateD;
    }

    public Integer getNumProductsD() {
        return numProductsD;
    }

    public void setNumProductsD(Integer numProductsD) {
        this.numProductsD = numProductsD;
    }

    public Double getFinalPriceD() {
        return finalPriceD;
    }

    public void setFinalPriceD(Double finalPriceD) {
        this.finalPriceD = finalPriceD;
    }

    public List<OrderProductD> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProductD> products) {
        this.products = products;
    }
}
