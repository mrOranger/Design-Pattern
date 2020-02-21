package com.edo.prototype;

/**
 * Factory to clone a Car using the Factory pattern
 */
public class CloneFactory {
    public static Car makeClone(Car car){
        return car.clone();
    }
}
