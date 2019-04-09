/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.service;

import com.sg.vendingmachinexm.dao.VendingMachineDao;
import com.sg.vendingmachinexm.dto.Change;
import com.sg.vendingmachinexm.dto.Product;
import java.math.BigDecimal;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Blake
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    private final VendingMachineDao dao;

    private BigDecimal myMoney = new BigDecimal("0");
    private int itemChoice;
    private String message;
    private Change change;
    private Change returnChange;

    @Inject
    public VendingMachineServiceLayerImpl(VendingMachineDao dao) {
        this.dao = dao;
        this.returnChange = new Change(new BigDecimal("0.00"));
        
    }

    @Override
    public List<Product> getItems() {
        return dao.getAllProducts();
    }

    @Override
    public Product getItem(int productId) {
        return dao.getProductById(productId);

    }

    @Override
    public Change vendItem() throws NoInventoryException, InsufficientFundsException {
        Product product = getItem(itemChoice);

        if (myMoney.floatValue() >= product.getCost().floatValue()) {
            if (product.getQuantity() > 0) {
                product.setQuantity(product.getQuantity() - 1);

                dao.updateProduct(product);
                myMoney = myMoney.subtract(product.getCost());
                change = new Change (myMoney);
                change.getChange(myMoney);
            this.setReturnChange(change);
                
            } else {
                throw new NoInventoryException("This item is no longer available.");
            }
        } else {
            throw new InsufficientFundsException("You do not have the funds to buy this product.");
        }
        return change;
    }

    @Override
    public BigDecimal depositMoney(BigDecimal money) {
        myMoney = myMoney.add(money);
        return myMoney;
    }

    @Override
    public void resetMoney() {
        myMoney = new BigDecimal("0");
        itemChoice = 0;
        change = new Change(new BigDecimal ("0"));
         returnChange = new Change(new BigDecimal ("0"));
         message = " ";
    }

    @Override
    public void addDollar() {
        myMoney = myMoney.add(new BigDecimal("1.00"));
    }

    @Override
    public void addQuarter() {
        myMoney = myMoney.add(new BigDecimal(".25"));
    }

    @Override
    public void addNickel() {
        myMoney = myMoney.add(new BigDecimal(".05"));
    }

    @Override
    public void addDime() {
        myMoney = myMoney.add(new BigDecimal(".10"));
    }

    @Override
    public void addPennies() {
        myMoney = myMoney.add(new BigDecimal(".01"));
    }

    @Override
    public BigDecimal showDeposit() {
        return myMoney;
    }

    @Override
    public String displayMsg() {
        return message;
    }
       @Override
    public void setMsg(String msg) {
         this.message = msg;
    }

    @Override
    public Change displayChange() {
        return change;
    }

    @Override
    public void setProductSelection(int productId) {
        itemChoice = productId;
    }

    @Override
    public int showId() {
        return itemChoice;
    }

    @Override
    public Change getReturnChange() {
        if(returnChange == null){
            returnChange = new Change(new BigDecimal("0.00"));
        }
       return returnChange;
    }

    @Override
    public void setReturnChange(Change change) {
        this.returnChange = change;
    }
}
