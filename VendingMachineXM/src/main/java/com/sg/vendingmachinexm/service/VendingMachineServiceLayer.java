/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.service;

import com.sg.vendingmachinexm.dto.Change;
import com.sg.vendingmachinexm.dto.Product;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Blake
 */
public interface VendingMachineServiceLayer {

    public List<Product> getItems();

    public Product getItem(int productId);

    public Change vendItem() throws NoInventoryException, InsufficientFundsException;

    public BigDecimal depositMoney(BigDecimal money);

    public void resetMoney();

    public void addDollar();

    public void addQuarter();

    public void addNickel();

    public void addDime();

    public BigDecimal showDeposit();

    public void setMsg(String msg);

    public String displayMsg();

    public Change displayChange();
    
    public Change getReturnChange();
    
     public void setReturnChange(Change change);

    public void setProductSelection(int ProductId);

    public void addPennies();

    public int showId();
}
