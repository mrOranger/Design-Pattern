package com.edo.facade;

/**
 * Concrete class representing a Bank.
 * The class implements the Facade pattern, exhibiting only the necessary methods to access to an Account
 */
public class Bank {
    
    private final AccountManager manager;
    
    public Bank(){
        this.manager = new AccountManager();
    }
    
    public Account registerANewAccount(int accountID){
        System.out.println("We are welcome to register your new account!");
        Account account = new Account(accountID, 0);
        this.manager.registerAccount(account);
        return account;
    }
    
    public boolean requireWithdraw(Account account, double amount){
        for(Account a : this.manager.getAccounts()){
            if(a.getAccountID() == account.getAccountID()){
                if(account.getAmount() > amount){
                    System.out.println("Okay, enjoy you money!");
                    account.setAmount(account.getAmount() - amount);
                    return true;
                }
            }
        }
        System.out.println("You cannot withdraw this sum!");
        return false;
    }
    
    public boolean consignMoney(Account account, double amount){
        for(Account a : this.manager.getAccounts()){
            if(a.getAccountID() == account.getAccountID()){
                account.setAmount(account.getAmount() + amount);
                System.out.println("Okay, money registered");
                return true;
            }
        }
        System.out.println("Seems that your account does not exists!");
        return false;
    }
    
    public String getInfo(Account account){
        for(Account a : this.manager.getAccounts()){
            if(a.getAccountID() == account.getAccountID()){
                return a.getAccountID() + " " + a.getAmount();
            }
        }
        return null;
    }
    
}
