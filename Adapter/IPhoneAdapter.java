package com.edo.adapter;

/**
 * Concrete class to adapt an IPhone device using the Android elements
 */
public class IPhoneAdapter implements FormatAndroid{
    
    private final IPhone iPhone;
    
    public IPhoneAdapter(IPhone iPhone){
        System.out.println("Adapting an IPhone using an Android");
        this.iPhone = iPhone;
    }

    @Override
    public void recharge() {
        this.iPhone.recharge();
    }

    @Override
    public void useUSB() {
        this.iPhone.useLightning();
    }
    
}
