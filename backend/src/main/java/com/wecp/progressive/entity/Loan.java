package com.wecp.progressive.entity;

public class Loan {

    private Long id;
    private String loanType;
    private double amount;
<<<<<<< HEAD
=======
    
    public Loan(Long id, String loanType, double amount) {
        this.id = id;
        this.loanType = loanType;
        this.amount = amount;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
>>>>>>> ed05b93118062d90e938992e263faecc6467134c

}