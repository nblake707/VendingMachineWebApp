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
public class VendingMachineServiceLayerTest {
    
    public VendingMachineServiceLayerTest() {
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
     * Test of getItems method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetItems() {
    }

    /**
     * Test of getItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetItem() {
    }

    /**
     * Test of vendItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testVendItem() throws Exception {
    }

    /**
     * Test of depositMoney method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testDepositMoney() {
    }

    /**
     * Test of resetMoney method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testResetMoney() {
    }

    /**
     * Test of addDollar method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddDollar() {
    }

    /**
     * Test of addQuarter method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddQuarter() {
    }

    /**
     * Test of addNickel method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddNickel() {
    }

    /**
     * Test of addDime method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddDime() {
    }

    /**
     * Test of showDeposit method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testShowDeposit() {
    }

    /**
     * Test of setMsg method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testSetMsg() {
    }

    /**
     * Test of displayMsg method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testDisplayMsg() {
    }

    /**
     * Test of displayChange method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testDisplayChange() {
    }

    /**
     * Test of getReturnChange method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetReturnChange() {
    }

    /**
     * Test of setReturnChange method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testSetReturnChange() {
    }

    /**
     * Test of setProductSelection method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testSetProductSelection() {
    }

    /**
     * Test of addPennies method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddPennies() {
    }

    /**
     * Test of showId method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testShowId() {
    }

    public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

        public List<Product> getItems() {
            return null;
        }

        public Product getItem(int productId) {
            return null;
        }

        public Change vendItem() throws NoInventoryException, InsufficientFundsException {
            return null;
        }

        public BigDecimal depositMoney(BigDecimal money) {
            return null;
        }

        public void resetMoney() {
        }

        public void addDollar() {
        }

        public void addQuarter() {
        }

        public void addNickel() {
        }

        public void addDime() {
        }

        public BigDecimal showDeposit() {
            return null;
        }

        public void setMsg(String msg) {
        }

        public String displayMsg() {
            return "";
        }

        public Change displayChange() {
            return null;
        }

        public Change getReturnChange() {
            return null;
        }

        public void setReturnChange(Change change) {
        }

        public void setProductSelection(int ProductId) {
        }

        public void addPennies() {
        }

        public int showId() {
            return 0;
        }
    }
    
}
