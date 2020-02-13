package com.edo.designpattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Concrete class representing the Subject to manage the Observers
 */
public class ConcreteSubject implements Subject{
    
    private final List<Observer> observers;
    
    public ConcreteSubject(){
        this.observers = new LinkedList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        if(!this.observers.contains(observer)){
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if(this.observers.contains(observer)){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyTo() {
        for(Observer o : this.observers){
            System.out.println("Update of: " + o.toString());
            o.update();
        }
    }
    
    
}
