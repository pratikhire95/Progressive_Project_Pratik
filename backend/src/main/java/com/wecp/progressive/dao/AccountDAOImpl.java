package com.wecp.progressive.dao;

<<<<<<< HEAD
public class AccountDAOImpl {
=======
import java.util.*;
import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Accounts;
import java.sql.*;

public class AccountDAOImpl implements AccountDAO {
    
    ArrayList<Accounts> acc = new ArrayList<>();

    Connection connection;

    public AccountDAOImpl() {
        try {
            connection = DatabaseConnectionManager.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int addAccount(Accounts accounts) {
        acc.add(accounts);
        return 1;
        // String sql = "INSERT INTO accounts(customer_id,balance)VALUES(?,?)";

        // try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        //     stmt.setInt(1, accounts.getCustomer_id());
        //     stmt.setDouble(2, accounts.getBalance());
        //     int count = stmt.executeUpdate();
        //     return count;

        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }
        // return 0;
    }

    @Override
    public void deleteAccount(int accountId) {
        
    }

    @Override
    public Accounts getAccountById(int accountId) {

        return acc.get(accountId);

        // String sql = "SELECT * FROM accounts WHERE account_id = ?";
        // try(PreparedStatement stmt = connection.prepareStatement(sql)){

        // }catch(SQLException e){
        //     e.printStackTrace();

        // }
        // return null;
    }

    @Override
    public List<Accounts> getAllAccounts() {
        
        return acc;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }
>>>>>>> 0d329e9283aa1be55cde7fc0ee304939f13f347d

}
