/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.dao;

import com.sg.vendingmachinexm.dto.Product;
import java.util.List;

/**
 *
 * @author Blake
 */
public interface VendingMachineDao {

    List<Product> getAllProducts();

    Product getProductById(int productId);

    Product updateProduct(Product product);

}
