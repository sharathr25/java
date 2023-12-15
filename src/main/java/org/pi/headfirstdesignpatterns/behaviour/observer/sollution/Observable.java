package org.pi.headfirstdesignpatterns.behaviour.observer.sollution;

public interface Observable<C> {
    void addObserver(Observer<C> observer);

    void removeObserver(Observer<C> observer);

    void notifyObservers();
}
