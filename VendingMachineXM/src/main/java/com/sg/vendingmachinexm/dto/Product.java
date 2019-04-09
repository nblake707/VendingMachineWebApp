/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.dto;

import java.math.BigDecimal;

/**
 *
 * @author Blake
 */
public class Product {
     private String name;
    private BigDecimal cost;
    private int quantity;
    private int productId;

    public Product(int productId, String name, BigDecimal cost, int quantity) {
        this.productId = productId;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
public String toString() {
    return "Name: " + name + " |Cost: " + cost 
             + " |Quantity: " + quantity + "|Id:" + productId ;
}
}

