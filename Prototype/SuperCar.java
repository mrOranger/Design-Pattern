package com.edo.prototype;
/**
 * Concrete class representing the Super Car to clone
 */
public class SuperCar implements Car{
    
    private String name;
    private String brand;
    
    public SuperCar(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    /**
     * Method to clone a Super car using the clone() method of Object class
     * @return Car
     */
    @Override
    public Car clone() {
        SuperCar superCarClone = null;
        try {
            superCarClone = (SuperCar)super.clone();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Error in cloning the Super Car: " + this.name + " made by: " + this.brand);
        }
        return superCarClone;
    }
    
    @Override
    public String toString(){
        return "Super Car: " + this.name + " made by: " + this.brand;
    }   
}
