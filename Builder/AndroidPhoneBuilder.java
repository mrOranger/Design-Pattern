package com.edo.builder;

/**
 * Concrete builder that build the Andoid Phone
 */
public class AndroidPhoneBuilder implements PhoneBuilder{
    
    private final Phone phone;
    
    public AndroidPhoneBuilder(){
        this.phone = new Phone();
    }

    @Override
    public void buildPhoneName() {
        this.phone.setName("Y6 Pro");
    }

    @Override
    public void buildPhoneOS() {
        this.phone.setOSName("Oreo");
    }

    @Override
    public void buildPhoneCPU() {
        this.phone.setCPU("Snapdragon");
    }

    @Override
    public void buildScreenSize() {
        this.phone.setScreenSize(9.9);
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
    
}
