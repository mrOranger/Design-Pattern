package com.edo.builder;

/**
 * Engineer that produce the specific product based on the specific Builder passed as paramter
 */
public class PhoneEngineer {
    
    private final PhoneBuilder phoneBuilder;
    
    public PhoneEngineer(PhoneBuilder phoneBuilder){
        this.phoneBuilder = phoneBuilder;
    }
    
    public void buildPhone(){
        this.phoneBuilder.buildPhoneName();
        this.phoneBuilder.buildPhoneCPU();
        this.phoneBuilder.buildPhoneOS();
        this.phoneBuilder.buildScreenSize();
    }
    
    public Phone getPhone(){
        return this.phoneBuilder.getPhone();
    }
    
}
