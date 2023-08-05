package org.pi.multithreading.usage.impl;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadImpl());
        Thread t2 = new Thread(new ThreadImpl());

        t1.start();
        t2.start();
    }
}
