package com.edo.designpattern;

/**
 * Concrete class that represents one strategy to implement.
 * The strategy decreases the total from a certain threshold.
 */
public class DiscountThreshold implements Discount{
    
    private int threshold;
    
    public DiscountThreshold(int threshold){
        this.threshold = threshold;
    }

    @Override
    public float applyDiscount(float total) {
        return total - (total*this.threshold)/100;
    }
}
