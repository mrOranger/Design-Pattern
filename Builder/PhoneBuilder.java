package com.edo.builder;

/**
 * Abstract Phone builder that defines the interface based on build a concrete Phone product
 */
public interface PhoneBuilder {
 
    public abstract void buildPhoneName();
    public abstract void buildPhoneOS();
    public abstract void buildPhoneCPU();
    public abstract void buildScreenSize();
    public abstract Phone getPhone();
}
