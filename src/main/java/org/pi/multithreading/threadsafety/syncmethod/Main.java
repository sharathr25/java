package org.pi.multithreading.threadsafety.syncmethod;


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
another common approach that we can use for achieving thread-safety is implementing synchronized methods.
check SyncCounter class incrementCounter method which is marked as synchronized

Simply put, only one thread can access a synchronized method at a time,
while blocking access to this method from other threads.
Other threads will remain blocked until the first thread finishes or the method throws an exception.
 */