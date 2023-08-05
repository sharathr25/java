package org.pi.multithreading.threadsafety.threadlocalvars;

import java.util.Arrays;
import java.util.List;

public class ThreadExt extends Thread {
    private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    @Override
    public void run() {
        numbers.forEach(System.out::println);
    }
}

/*
In Object-Oriented Programming (OOP),
objects actually need to maintain state through fields
and implement behavior through one or more methods.

If we actually need to maintain state,
we can create thread-safe classes that don't share state between threads by making their fields thread-local.

We can easily create classes whose fields are thread-local by simply defining private fields in Thread classes.

We could define, for instance, a Thread class that stores an array of integers as shown above
 */