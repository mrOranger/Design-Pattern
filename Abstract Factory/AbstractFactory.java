package com.edo.abstractfactory;

/**
 * Abstract factory that defines the methods returning the products
 */
public interface AbstractFactory {
    public AppleProduct getAppleProduct(String type);
    public WindowProduct getWindowProduct(String type);
}
