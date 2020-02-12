package com.edo.designpattern;

/**
 * Concrete class that represents one strategy to implement.
 * The strategy decreases the total from the age.
 */
public class DiscountAge implements Discount{
    
    private int age;
    
    public DiscountAge(int age){
        this.age = age;
    }

    @Override
    public float applyDiscount(float total) {
        if((total - age) < 0){
            return 0;
        }
        return total - age;
    }
    
}
