package com.edo.abstractfactory;

/**
 * Main class to text if the Design Pattern works
 */
public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        AppleProduct appleButton = factory.getAppleProduct("button");
        AppleProduct appleTextfiel = factory.getAppleProduct("text field");
        WindowProduct windowButton = factory.getWindowProduct("button");
        WindowProduct windowTextfile = factory.getWindowProduct("text field");
        System.out.println(appleButton.toString());
        System.out.println(appleTextfiel.toString());
        System.out.println(windowButton.toString());
        System.out.println(windowTextfile.toString());
    }
}
