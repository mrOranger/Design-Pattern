package com.edo.adapter;

/**
 * Concrete class representing a generic Android device implementing the format interfact
 */
public class Android implements FormatAndroid{
    
    private boolean connected;
    
    public Android(){
        this.connected = false;
    }

    @Override
    public void recharge() {
        if(this.connected == true){
            System.out.println("Recharging android device: " + this.hashCode());
            System.out.println("25%...");
            System.out.println("50%...");
            System.out.println("275%...");
            System.out.println("100%...");
            System.out.println("Recharge completed!");
        }
    }

    @Override
    public void useUSB() {
        this.connected = true;
    }
    
}
