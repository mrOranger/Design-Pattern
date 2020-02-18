package com.edo.builder;

/**
 * Client class that requires the specific product to build, thanks to the PhoneEngineer and the AbstractFactory
 */
public class Client {
    
    public static void main(String[] args){
        PhoneEngineer engineerAndroid = new PhoneEngineer(new ConcretePhoneFactory().getPhoneBuilder("android"));
        PhoneEngineer engineerApple = new PhoneEngineer(new ConcretePhoneFactory().getPhoneBuilder("apple"));
        engineerAndroid.buildPhone();
        engineerApple.buildPhone();
        System.out.println(engineerApple.getPhone().toString());
        System.out.println(engineerAndroid.getPhone().toString());
    }
    
}
