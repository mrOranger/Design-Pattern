package com.edo.facade;

/**
 * Concrete class client that use the Bank Facade
 */
public class Client {
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account myAccount = bank.registerANewAccount(1);
        bank.consignMoney(myAccount, 1000);
        bank.requireWithdraw(myAccount, 500);
        System.out.println(bank.getInfo(myAccount));
    }
}
