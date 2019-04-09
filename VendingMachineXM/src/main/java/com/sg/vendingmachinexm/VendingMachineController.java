/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachinexm;

import com.sg.vendingmachinexm.dto.Change;
import com.sg.vendingmachinexm.dto.Product;
import com.sg.vendingmachinexm.service.InsufficientFundsException;
import com.sg.vendingmachinexm.service.NoInventoryException;
import com.sg.vendingmachinexm.service.VendingMachineServiceLayer;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Blake
 */
@Controller
public class VendingMachineController {

    VendingMachineServiceLayer service;

    @Inject
    public VendingMachineController(VendingMachineServiceLayer service) {
        this.service = service;
    }

    //url: localhost:8080/VendingMachineSpringMVC/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayAllProducts(Model model) {
        //put the List of Contacts on the Model
        model.addAttribute("productList", service.getItems());
        model.addAttribute("balance", service.showDeposit());
        model.addAttribute("itemId", service.showId());
        model.addAttribute("message", service.displayMsg());
        Change change = service.getReturnChange();
        model.addAttribute("change",change );
        return "index";
    }

    @RequestMapping(value = "/chooseItem/{productId}", method = RequestMethod.GET)
    public String chooseItem(@PathVariable("productId") int productId) {
        service.setProductSelection(productId);
        return "redirect:/";
    }

    //url: localhost:8080/VendingMachineSpringMVC/makePurchase
    @RequestMapping(value = "/makePurchase", method = RequestMethod.GET)
    public String makePurchase(Model model) {
        try {
            service.vendItem();
        } catch (NoInventoryException ex) {
            service.setMsg(ex.getMessage());
        } catch (InsufficientFundsException ex) {
            service.setMsg(ex.getMessage());

        }

        return "redirect:/";
    }

    @RequestMapping(value = "/addDollar", method = RequestMethod.GET)
    public String addDollar() {
        service.addDollar();
        return "redirect:/";
    }

    @RequestMapping(value = "/addQuarter", method = RequestMethod.GET)
    public String addQuarter() {
        service.addQuarter();
        return "redirect:/";
    }

    @RequestMapping(value = "/addDime", method = RequestMethod.GET)
    public String addDime() {
        service.addDime();
        return "redirect:/";
    }

    @RequestMapping(value = "/addNickel", method = RequestMethod.GET)
    public String addNickel() {
        service.addNickel();
        return "redirect:/";
    }

    @RequestMapping(value = "/addPennies", method = RequestMethod.GET)
    public String addPennies() {
        service.addPennies();
        return "redirect:/";
    }

    @RequestMapping(value = "/changeReturn", method = RequestMethod.GET)
    public String changeReturn(Model model) {
        service.resetMoney();
        return "redirect:/";
    }
}
