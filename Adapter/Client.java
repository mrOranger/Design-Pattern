package com.edo.adapter;

/**
 * Client class the uses the Adapters
 */
public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Android android = new Android();
        IPhoneAdapter adapter = new IPhoneAdapter(iPhone);
        
        iPhone.useLightning();
        iPhone.recharge();
        
        android.useUSB();
        android.recharge();
        
        System.out.println("Using the adapter");
        adapter.useUSB();
        adapter.recharge();
        
    }
}
