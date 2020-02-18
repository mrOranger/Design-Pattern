package com.edo.builder;

/**
 * Factory class that build the conrete product based on the field
 */
public class ConcretePhoneFactory implements AbstractPhoneFactory {

    @Override
    public PhoneBuilder getPhoneBuilder(String phoneType) {
        if(phoneType.toLowerCase().equals("apple")){
            return new IPhoneBuilder();
        }
        if(phoneType.toLowerCase().equals("android")){
            return new AndroidPhoneBuilder();
        }
        return null;
    }
    
}
