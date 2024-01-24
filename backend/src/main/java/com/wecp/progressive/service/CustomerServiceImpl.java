package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customers> cl;

    
    CustomerDAO customerDao;
    public CustomerServiceImpl(CustomerDAO customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return null;
        
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return null;
        
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return -1;
        
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // TODO Auto-generated method stub
        return cl;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
       cl.add(customers);
       return cl;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        List<Customers> sortedcl = cl;
        Collections.sort(sortedcl);
        return sortedcl;
    }

    @Override
    public void emptyArrayList() {
        cl = new ArrayList<Customers>();
        
    }

}