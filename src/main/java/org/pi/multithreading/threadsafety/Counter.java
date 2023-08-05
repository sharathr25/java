package org.pi.multithreading.threadsafety;

public class Counter {
    private int counter = 0;

    public void incrementCounter() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
