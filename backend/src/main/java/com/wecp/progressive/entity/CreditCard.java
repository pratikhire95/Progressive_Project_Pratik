package com.wecp.progressive.entity;

public class CreditCard {

    private Long id;
    private String cardNumber;
    private String cardHolderName;
<<<<<<< HEAD
=======
    
    public CreditCard(Long id, String cardNumber, String cardHolderName) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
    
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
>>>>>>> 0d329e9283aa1be55cde7fc0ee304939f13f347d
}