package com.edo.abstractfactory;

/**
 * Concrete product representing a button of Apple's family
 */
public class AppleButton implements AppleProduct{

    @Override
    public int getSize() {
        return 9;
    }

    @Override
    public String getType() {
        return "Button";
    }
    
    @Override
    public String toString(){
        return "Apple " + this.getType() + " " + this.getSize();
    }
    
}
