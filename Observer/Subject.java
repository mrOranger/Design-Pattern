package com.edo.designpattern;

/**
 * Interface that manage the update of the Observers
 */
public interface Subject {
    public abstract void addObserver(Observer observer); //Add a new observer
    public abstract void removeObserver(Observer observer); //Remove an observer if exists
    public abstract void notifyTo(); //Notify to all observers the changes
}
