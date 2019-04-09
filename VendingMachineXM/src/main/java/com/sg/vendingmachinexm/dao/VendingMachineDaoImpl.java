/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.dao;

import com.sg.vendingmachinexm.dto.Product;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Blake
 */
public class VendingMachineDaoImpl implements VendingMachineDao {

    private static Map<Integer, Product> products;

    public VendingMachineDaoImpl() {
        products = new HashMap<>();
        
        products.put(1, new Product(1, "Snickers", new BigDecimal("1.85"), 9));
        products.put(2, new Product(2, "M & Ms", new BigDecimal("1.50"), 2));
        products.put(3, new Product(3, "Pringles", new BigDecimal("2.10"), 5));
        products.put(4, new Product(4, "Reese's", new BigDecimal("1.85"), 4));
        products.put(5, new Product(5, "Pretzels", new BigDecimal("1.25"), 9));
        products.put(6, new Product(6, "Twinkies", new BigDecimal("1.95"), 3));
        products.put(7, new Product(7, "Doritos", new BigDecimal("1.75"), 11));
        products.put(8, new Product(8, "Almond Joy", new BigDecimal("1.85"), 0));
        products.put(9, new Product(9, "Trident", new BigDecimal("1.95"), 6));

    }

    @Override
    public List<Product> getAllProducts() {
        return products.values().stream()
    
                .collect(Collectors.toList());
    }

    @Override
    public Product getProductById(int productId) {
        return products.get(productId);
    }

    @Override
    public Product updateProduct(Product product) {
        Product newProduct = products.put(product.getProductId(), product);
        return newProduct;
    }


}
