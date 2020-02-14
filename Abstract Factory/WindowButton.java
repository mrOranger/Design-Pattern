package com.edo.abstractfactory;

/**
 * Concrete product representing a button of Windows' family
 */
public class WindowButton implements WindowProduct{
   
    @Override
    public int getSize() {
        return 10;
    }

    @Override
    public String getType() {
        return "Button";
    }
    
    @Override
    public String toString(){
        return "Window " + this.getType() + " " + this.getSize();
    }
    
}
