package com.edo.designpattern;

/**
 * Interface that determines the strategy to use in the context
 */
public interface Discount {

    /**
     * Abstract method that defines the alghoritm to use
     * @param total
     * @return float
     */
    abstract float applyDiscount(float total);
}
