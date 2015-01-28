package com.example.dao;

import com.example.model.Customer;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public class CustomerDAOImpl implements CustomerDAO {

    private MongoOperations mongoOps;
    private static final String CUSTOMERS_COLLECTION = "customers";

    public CustomerDAOImpl(MongoOperations mongoOps){
        this.mongoOps=mongoOps;
    }

    @Override
    public void create(Customer c) {

        this.mongoOps.insert(c, CUSTOMERS_COLLECTION);
    }

    @Override
    public Customer readById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return this.mongoOps.findOne(query, Customer.class, CUSTOMERS_COLLECTION);
    }

    @Override
    public void update(Customer p) {
        this.mongoOps.save(p, CUSTOMERS_COLLECTION);
    }

    @Override
    public int deleteById(String id) {
        Query query = new Query(Criteria.where("_id").is(id));
        WriteResult result = this.mongoOps.remove(query, Customer.class, CUSTOMERS_COLLECTION);
        return result.getN();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.mongoOps.findAll(Customer.class, CUSTOMERS_COLLECTION);
    }

}
