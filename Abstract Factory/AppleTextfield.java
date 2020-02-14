package com.edo.abstractfactory;

/**
 * Concrete product representing an text field of Apple's family
 */
public class AppleTextfield implements AppleProduct{

    @Override
    public int getSize() {
        return 15;
    }

    @Override
    public String getType() {
        return "Text field";
    }
    
    @Override
    public String toString(){
        return "Apple " + this.getType() + " " + this.getSize();
    }
    
}
