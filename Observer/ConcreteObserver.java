package com.edo.designpattern;

/**
 * Concrete class that defines an Observer
 */
public class ConcreteObserver implements Observer{
    
    private String status; //Attribute defining the status of the object
    
    public ConcreteObserver(){
        this.status = "blocked";
        System.out.println(this.toString() + " status: blocked");
    }
    
    /**
     * Method that update the status from blocked to unlock
     */
    @Override
    public synchronized void update() {
        if(this.status.equals("blocked")){
            System.out.println(this.toString() + " status: unlocked");
            this.status = "unlock";
        }
    }
    
}
