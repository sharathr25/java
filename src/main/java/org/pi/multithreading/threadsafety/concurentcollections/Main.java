package org.pi.multithreading.threadsafety.concurentcollections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> map = new HashMap<>();

        Thread thread1 = new Thread(() -> map.put("1", "a"));
        Thread thread2 = new Thread(() -> map.put("1", "b"));

        thread1.start();
        thread2.start();

        Thread.sleep(1000);
        System.out.println(map); // might give {1=a} or {1=b}

        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        Thread thread3 = new Thread(() -> concurrentMap.put("1", "a"));
        Thread thread4 = new Thread(() -> concurrentMap.put("1", "b"));

        thread3.start();
        thread4.start();

        Thread.sleep(1000);
        System.out.println(concurrentMap); // always give {1=b}
    }
}

/*
Alternatively to synchronized collections, we can use concurrent collections to create thread-safe collections.

Java provides the java.util.concurrent package,
which contains several concurrent collections, such as ConcurrentHashMap as shown above

Unlike their synchronized counterparts,
concurrent collections achieve thread-safety by dividing their data into segments.
In a ConcurrentHashMap, for example,
several threads can acquire locks on different map segments,
so multiple threads can access the Map at the same time.

Concurrent collections are much more performant than synchronized collections,
due to the inherent advantages of concurrent thread access.

It's worth mentioning that synchronized
and concurrent collections only make the collection itself thread-safe
and not the contents.
 */
