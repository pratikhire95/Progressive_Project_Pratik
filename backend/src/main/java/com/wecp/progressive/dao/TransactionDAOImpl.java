package com.wecp.progressive.dao;

<<<<<<< HEAD

public class TransactionDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Transactions;

public class TransactionDAOImpl implements TransactionDAO{

    @Override
    public int addTransaction(Transactions transaction) {
       
        return 0;
    }

    @Override
    public void deleteTransaction(int transactionId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Transactions> getAllTransactions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Transactions getTransactionById(int transactionId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateTransaction(Transactions transaction) {
        // TODO Auto-generated method stub
        
    }
>>>>>>> ed05b93118062d90e938992e263faecc6467134c



}
