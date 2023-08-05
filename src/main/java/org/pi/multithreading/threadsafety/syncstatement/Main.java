package org.pi.multithreading.threadsafety.syncstatement;


import org.pi.multithreading.threadsafety.Counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 1; i <= 10000; i++) {
            Thread thread = new Thread(counter::incrementCounter);
            thread.start();
        }

        Thread.sleep(500);
        System.out.println(counter.getCounter()); // might be 9997 or 9998 or 9999 or 10000

        SyncCounter syncCounter = new SyncCounter();

        for (int i = 1; i <= 10000; i++) {
            Thread thread = new Thread(syncCounter::incrementCounter);
            thread.start();
        }

        Thread.sleep(500);
        System.out.println(syncCounter.getCounter()); // always 10000
    }
}

/*
We know we can synchronize a method which we have done in syncmethod/SyncCounter incrementCounter.
But,
synchronizing an entire method might be overkill if we just need to make a segment of the method thread-safe.

So we can use sync statements
*/