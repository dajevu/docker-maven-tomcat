package com.example.dao;

import com.example.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerDAO {

    public void create(Customer p);

    public Customer readById(String id);

    public void update(Customer p);

    public int deleteById(String id);

    public List<Customer> getAllCustomers();
}