package com.edo.facade;

import java.util.LinkedList;
import java.util.List;

/**
 * Concrete class representing the manager of all the bank's account
 */
public class AccountManager {
    
    private final List<Account> account;
    
    public AccountManager(){
        this.account = new LinkedList<Account>();
    }
    
    public boolean checkAccount(int ID){
        for(Account a : this.account){
            if(a.getAccountID() == ID){
                return true;
            }
        }
        return false;
    }
    
    public void registerAccount(Account account){
        this.account.add(account);
    }
    
    public double getAmount(Account account){
        for(Account a : this.getAccounts()){
            if(a.getAccountID() == account.getAccountID()){
                return a.getAmount();
            }
        }
        return -1;
    }
    
    public List<Account> getAccounts(){
        return this.account;
    }
    
    @Override
    public String toString(){
        String str = new String();
        for(Account a : this.account){
            str += a.getAccountID() + " " + a.getAmount() + '\n';
        }
        return str;
    }
    
}
