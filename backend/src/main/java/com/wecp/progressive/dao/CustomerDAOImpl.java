package com.wecp.progressive.dao;

<<<<<<< HEAD
public class CustomerDAOImpl {

=======
import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public int addCustomer(Customers customers) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteCustomer(int customerId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Customers> getAllCustomers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Customers getCustomerById(int customerId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateCustomer(Customers customers) {
        // TODO Auto-generated method stub
        
    }
    
>>>>>>> 0d329e9283aa1be55cde7fc0ee304939f13f347d
}
