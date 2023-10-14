package org.pi.designpatterns.iterator;

public interface Iterator<T> {
    T current();
    boolean hasNext();
    void next();
}
