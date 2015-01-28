package com.example.main;

import com.example.dao.CustomerDAO;
import com.example.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");

        CustomerDAO customerDao = ctx.getBean("customerDao", CustomerDAO.class);

        List<Customer> customers = customerDao.getAllCustomers();

        System.out.println("Retrieved Person=" + customers.get(0).getCustomerID());
    }

}
