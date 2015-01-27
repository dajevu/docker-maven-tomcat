package com.example.controller;

import com.example.dao.CustomerDAO;
import com.example.dao.CustomerDAOImpl;
import com.example.model.Customer;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class RestSpringController {

    @Autowired
    CustomerDAO customerService;

    /*
    @RequestMapping(value = "/{id}", method = RequestMethod.GET,headers="Accept=application/json")
    public BIConversion.User getUser(@PathVariable int id) {
        BIConversion.User user=userService.getUserById(id);
        return user;
    }
    */

    @RequestMapping(method = RequestMethod.GET, headers="Accept=application/json")
    public List<Customer> getAllCustomers() {
        System.out.println("HERE!!!!");
        return customerService.getAllCustomers();
    }

    public CustomerDAO getCustomerService() {
        return customerService;
    }

    public void setCustomerService(CustomerDAO customerService) {
        this.customerService = customerService;
    }
}