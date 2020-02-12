package com.edo.designpattern;

/**
 * Singleton class representing the class to instantiate only one time
 */
public class Singleton {
    
    private static Singleton instance; //Attribute representing the instance of the class
    private String name;
    
    /**
     * Private constructor callable only by the method getInstance()
     */
    private Singleton(){
        this.name = null;
    }
    
    /**
     * Method that return the instance assigned to the class that can be only one.
     * If the instance attribute have been already instantiated it returns those instance.
     * @return Singleton
     */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    
}
