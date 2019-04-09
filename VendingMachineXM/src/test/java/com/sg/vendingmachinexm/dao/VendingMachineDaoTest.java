/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm.dao;

import com.sg.vendingmachinexm.dto.Product;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Blake
 */
public class VendingMachineDaoTest {
    public VendingMachineDao dao;
    
    public VendingMachineDaoTest() {
        this.dao = new VendingMachineDaoImpl();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllProducts method, of class VendingMachineDao.
     */
    @Test
    public void testGetAllProducts() {
        //Assert that the list has 9 items in it
        // assertEquals(expected,result)
        assertEquals(9,dao.getAllProducts().size());
    }

    /**
     * Test of getProductById method, of class VendingMachineDao.
     */
    @Test
    public void testGetProductById() {
        
        Product item1 = new Product (1, "Snickers", new BigDecimal("1.85"), 9);
        
        Product item2 = dao.getProductById(1);
        
        assertEquals(item1.getProductId(),item2.getProductId());
        
    }

    /**
     * Test of updateProduct method, of class VendingMachineDao.
     */
    @Test
    public void testUpdateProduct() {
      
//         @Override
//    public Product updateProduct(Product product) {
//        Product newProduct = products.put(product.getProductId(), product);
//        return newProduct;

        Product newProduct = new Product(1,"Snickers", new BigDecimal("1.85"), 9);
        
        newProduct.setQuantity(10);
        
        dao.updateProduct(newProduct);
        
        Product product2 = dao.getProductById(1);
        
        assertEquals(newProduct.getQuantity(),product2.getQuantity());
        
        
    }
}
       
    

 
