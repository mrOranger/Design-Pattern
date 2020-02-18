package com.edo.builder;

/**
 * Class Phone representing the product to build
 */
public class Phone {
 
    private String Name;
    private String OSName;
    private String CPU;
    private double screenSize;
    
    public Phone(){
        this.Name = new String();
        this.OSName = new String();
        this.CPU = new String();
        this.screenSize = 0;
    }
    
    public Phone(String name, String osname, String cpu, double screenSize){
        this.Name = name;
        this.OSName = osname;
        this.CPU = cpu;
        this.screenSize = screenSize;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOSName() {
        return OSName;
    }

    public void setOSName(String OSName) {
        this.OSName = OSName;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    
    @Override
    public String toString(){
        return this.Name + " " + this.CPU + " " + this.OSName + " " + this.screenSize;
    }
    
}
