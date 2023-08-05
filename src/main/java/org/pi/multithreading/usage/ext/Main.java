package org.pi.multithreading.usage.ext;

public class Main {
    public static void main(String[] args) {
        ThreadExt t1 = new ThreadExt();
        ThreadExt t2 = new ThreadExt();

        t1.start();
        t2.start();
    }
}
