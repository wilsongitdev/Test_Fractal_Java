package com.example.TecnicalTestJava.domain;

import java.util.Date;

public class OrderD {
    private int idOrderD;
    private int numOrderD;
    private Date dateD;

    private Integer numProductsD;
    private Double finalPriceD;

    public int getIdOrderD() {
        return idOrderD;
    }

    public void setIdOrderD(int idOrderD) {
        this.idOrderD = idOrderD;
    }

    public int getNumOrderD() {
        return numOrderD;
    }

    public void setNumOrderD(int numOrderD) {
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
}
