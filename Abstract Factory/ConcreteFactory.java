package com.edo.abstractfactory;

/**
 * Concrete factory that defines methods returing the chosen products
 */
public class ConcreteFactory implements AbstractFactory{

    @Override
    public AppleProduct getAppleProduct(String type) {
        if(type.equals("button")){
            return new AppleButton();
        }
        if(type.equals("text field")){
            return new AppleTextfield();
        }
        return null;
    }

    @Override
    public WindowProduct getWindowProduct(String type) {
        if(type.equals("button")){
            return new WindowButton();
        }
        if(type.equals("text field")){
            return new WindowTextfield();
        }
        return null;
    }
}
