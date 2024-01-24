package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.AccountDAO;

import com.wecp.progressive.entity.Accounts;

public class AccountServiceImpl implements AccountService {
    private static List<Accounts> al ;
    private AccountDAO accountDao;

    public AccountServiceImpl(AccountDAO accountDao){
        this.accountDao = accountDao;
    }
    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        // TODO Auto-generated method stub
        return null;
        
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
        
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
        
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        return -1;
       
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        // TODO Auto-generated method stub
        return al;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        
        
        al.add(accounts);
        return al;
        
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        // TODO Auto-generated method stub
        List<Accounts> sortedList = al;
        Collections.sort(sortedList);
        return sortedList;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        al = new ArrayList<>();
    }

}