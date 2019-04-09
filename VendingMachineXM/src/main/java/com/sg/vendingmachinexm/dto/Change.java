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
public class Change {

    private BigDecimal pennies = new BigDecimal("0.01");
    private BigDecimal nickels = new BigDecimal("0.05");
    private BigDecimal dimes = new BigDecimal("0.10");
    private BigDecimal quarters = new BigDecimal("0.25");

    private int coinQuarters = 0, CoinDimes = 0, coinNickels = 0, coinPennies = 0;

    public Change(BigDecimal money) {
       
    }

    public void getChange (BigDecimal change) {
    
        while (change.floatValue() > 0) {

            if (change.floatValue() >= .25) {
                change = change.subtract(quarters);
                coinQuarters++;
            } else if (change.floatValue() >= .10) {
                change = change.subtract(dimes);
                CoinDimes++;
            } else if (change.floatValue() >= .5) {
                change = change.subtract(nickels);
                coinNickels++;
            } else {
                change = change.subtract(pennies);
                coinPennies++;
            }

        }
    }

    public int getCoinQuarters() {
        return coinQuarters;
    }

    public int getCoinDimes() {
        return CoinDimes;
    }

    public int getCoinNickels() {
        return coinNickels;
    }

    public int getCoinPennies() {
        return coinPennies;
    }
    

    

}

