package com.example.TecnicalTestJava.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ProductD {
    private int idProductD;

    private String nameD;

    private Double unitPriceD;

    private int quantityD;


    public int getIdProductD() {
        return idProductD;
    }

    public void setIdProductD(int idProductD) {
        this.idProductD = idProductD;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public Double getUnitPriceD() {
        return unitPriceD;
    }

    public void setUnitPriceD(Double unitPriceD) {
        this.unitPriceD = unitPriceD;
    }


    public int getQuantityD() {
        return quantityD;
    }

    public void setQuantityD(int quantityD) {
        this.quantityD = quantityD;
    }


}
