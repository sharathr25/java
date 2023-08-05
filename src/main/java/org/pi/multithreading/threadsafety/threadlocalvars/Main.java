package org.pi.multithreading.threadsafety.threadlocalvars;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new ThreadExt();
        Thread t2 = new ThreadExt();

        t1.start();
        t2.start();
    }
}
