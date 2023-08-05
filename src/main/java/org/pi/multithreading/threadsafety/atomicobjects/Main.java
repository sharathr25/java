package org.pi.multithreading.threadsafety.atomicobjects;

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

        AtomicCounter atomicCounter = new AtomicCounter();

        for (int i = 1; i <= 10000; i++) {
            Thread thread = new Thread(atomicCounter::incrementCounter);
            thread.start();
        }

        Thread.sleep(500);
        System.out.println(atomicCounter.getCounter()); // always 10000
    }
}

/*
It's also possible to achieve thread-safety using the set of atomic classes that Java provides,
including AtomicInteger, AtomicLong, AtomicBoolean and AtomicReference.

Atomic classes allow us to perform atomic operations,
which are thread-safe, without using synchronization.
An atomic operation is executed in one single machine-level operation.

Let's suppose that in a race condition, two threads access the incrementCounter() method at the same time.

In theory, the final value of the counter field will be 2.
But we just can't be sure about the result
because the threads are executing the same code block at the same time
and incrementation is not atomic.

created a thread-safe implementation of the Counter class by using an AtomicInteger object refer AtomicCounter class
This is thread-safe because while incrementation, ++, takes more than one operation, incrementAndGet is atomic.
 */