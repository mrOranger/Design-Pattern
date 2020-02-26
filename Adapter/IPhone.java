package com.edo.adapter;

/**
 * Concrete class defining an IPhone
 */
public class IPhone implements FormatIPhone{
    
    private boolean connected;
    
    public IPhone(){
        this.connected = false;
    }

    @Override
    public void recharge() {    
        if(this.connected == true){
            System.out.println("Recharging iPhone device: " + this.hashCode());
            System.out.println("25%...");
            System.out.println("50%...");
            System.out.println("275%...");
            System.out.println("100%...");
            System.out.println("Recharge completed!");
        }
    }

    @Override
    public void useLightning() {
        this.connected = true;
    }
}
