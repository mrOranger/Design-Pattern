package com.edo.abstractfactory;

/**
 * Concrete product representing a text field of Windows' family
 */
public class WindowTextfield implements WindowProduct{

    @Override
    public int getSize() {
        return 20;
    }

    @Override
    public String getType() {
        return "Text field";
    }
    
    @Override
    public String toString(){
        return "Window " + this.getType() + " " + this.getSize();
    }
    
}
