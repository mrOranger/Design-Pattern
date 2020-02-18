package com.edo.builder;

/**
 * Concrete iPhone builder that produces an iPhone product
 */
public class IPhoneBuilder implements PhoneBuilder{
    
    private Phone phone;
    
    public IPhoneBuilder(){
        this.phone = new Phone();
    }

    @Override
    public void buildPhoneName() {
        this.phone.setName("iPhone");
    }

    @Override
    public void buildPhoneOS() {
        this.phone.setOSName("OSX");
    }

    @Override
    public void buildPhoneCPU() {
        this.phone.setCPU("A9");
    }

    @Override
    public void buildScreenSize() {
        this.phone.setScreenSize(14.5);
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }
}
