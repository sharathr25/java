package org.pi.multithreading.threadsafety.syncstatement;

public class SyncCounter {
    private int counter = 0;

    public void incrementCounter() {
        synchronized(this) {
            counter += 1;
        }
    }

    public int getCounter() {
        return counter;
    }
}
