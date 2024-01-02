package org.pi.headfirstdesignpatterns.create.singleton.problem;

public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
        };
        Runnable runnable2 = () -> {
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }
}
