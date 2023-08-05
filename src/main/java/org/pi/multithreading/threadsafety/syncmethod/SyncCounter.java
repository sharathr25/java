package org.pi.multithreading.threadsafety.syncmethod;

public class SyncCounter {
    private int counter = 0;

    public synchronized void incrementCounter() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
