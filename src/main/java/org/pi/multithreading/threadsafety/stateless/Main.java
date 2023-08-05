package org.pi.multithreading.threadsafety.stateless;

import java.math.BigInteger;

public class Main {
    public static BigInteger factorial(int number) {
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(factorial(5)));
        Thread t2 = new Thread(() -> System.out.println(factorial(5)));

        t1.start();
        t2.start();
    }
}
/*
The factorial() method is a stateless deterministic function.
Given a specific input, it always produces the same output.

The method neither relies on external state nor maintains state at all.
So, it's considered to be thread-safe and can be safely called by multiple threads at the same time.

All threads can safely call the factorial() method
and will get the expected result without interfering with each other
and without altering the output that the method generates for other threads.

Therefore, stateless implementations are the simplest way to achieve thread-safety.
 */