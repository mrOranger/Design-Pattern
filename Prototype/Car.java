package com.edo.prototype;

/**
 * Interface that define the abastract prototype to clone
 */
public interface Car extends Cloneable{
    public abstract Car clone();
}
