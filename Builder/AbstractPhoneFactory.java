package com.edo.builder;

/**
 * Abstract Factory class that return the specific element based on the parameter in input
 */
public interface AbstractPhoneFactory {
    public abstract PhoneBuilder getPhoneBuilder(String phoneType);
}
