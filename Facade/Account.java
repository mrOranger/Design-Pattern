package com.edo.facade;

/**
 * Concrete class representing a bank's account having an ID and money
 */
public class Account implements Comparable<Account>{
    
    private int accountID;
    private double amount;
    
    public Account(int accountID, double amount){
        this.accountID = accountID;
        this.amount = 0;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public int compareTo(Account account) {
        if(account.getAccountID() == this.getAccountID()){
            return 0;
        }
        if(account.getAccountID() > this.getAccountID()){
            return 1;
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.getAccountID() + " Total: " + this.getAmount();
    }
}
