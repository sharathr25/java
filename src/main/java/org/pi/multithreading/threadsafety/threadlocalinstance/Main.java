package org.pi.multithreading.threadsafety.threadlocalinstance;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(ThreadState.getState()));
        Thread t2 = new Thread(() -> System.out.println(ThreadState.getState()));

        t1.start();
        t2.start();
    }
}

/*
we can create thread-local fields by assigning ThreadLocal instances to a field.

Thread-local i.e. ThreadState fields are pretty much like normal class fields,
except that each thread that accesses them via a setter/getter gets
an independently initialized copy of the field so that each thread has its own state.
 */