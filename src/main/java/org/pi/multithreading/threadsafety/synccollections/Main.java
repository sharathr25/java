package org.pi.multithreading.threadsafety.synccollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Collection<Integer> collection = new ArrayList<>();

        Thread thread1 = new Thread(() -> collection.add(1));
        Thread thread2 = new Thread(() -> collection.add(2));

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println(Arrays.toString(collection.toArray())); // might give [1, 2] or [2, 1]

        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());

        Thread thread3 = new Thread(() -> syncCollection.add(1));
        Thread thread4 = new Thread(() -> syncCollection.add(2));

        thread3.start();
        thread4.start();

        Thread.sleep(1000);
        System.out.println(Arrays.toString(syncCollection.toArray())); // always give [1, 2]
    }
}

/*
We can easily create thread-safe collections
by using the set of synchronization wrappers included within the collections framework.

We can use, for instance,
one of these synchronization wrappers to create a thread-safe collection as shown above

This means that the methods can be accessed by only one thread at a time,
while other threads will be blocked until the method is unlocked by the first thread.
 */