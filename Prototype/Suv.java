package com.edo.prototype;

/**
 * Concrete class representing a Suv to clone
 */
public class Suv implements Car{
    
    private final String name;
    private final String brand;
    
    public Suv(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    /**
     * Method that clone the concrete element SUV using the clone() method defined in Object
     * @return Car
     */
    @Override
    public Car clone() {
        Suv suvClone = null;
        try {
            suvClone = (Suv) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Error in cloning the SUV " + this.name + " made by: " + this.brand);
        }
        return suvClone;
    }
    
    @Override 
    public String toString(){
        return "SUV " + this.name + " made by: " + this.brand;
    }
}
