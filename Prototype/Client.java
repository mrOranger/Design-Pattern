package com.edo.prototype;

/**
 * Client class that use the CloneFactory class to make a copy of a defined Car
 */
public class Client {
    
    public static void main(String[] args) {
        Car superCar = new SuperCar("F40", "Ferrari");
        Car suv = new Suv("Cruiser", "Range Rover");
        Car cloneSuperCar = CloneFactory.makeClone(superCar);
        Car cloneSuv = CloneFactory.makeClone(suv);
        System.out.println(superCar.toString() + " " + superCar.hashCode());
        System.out.println(suv.toString() + " " + suv.hashCode());
        System.out.println(cloneSuperCar.toString() + " " + cloneSuperCar.hashCode());
        System.out.println(cloneSuv.toString() + " " + cloneSuv.hashCode());
    }
    
}
