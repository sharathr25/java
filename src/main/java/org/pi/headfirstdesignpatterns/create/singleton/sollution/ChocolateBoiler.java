package org.pi.headfirstdesignpatterns.create.singleton.sollution;

public class ChocolateBoiler {
    private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    static ChocolateBoiler getInstance() {
        return INSTANCE;
    }

    // fill the boiler with a milk/chocolate mixture
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filled");
        }
    }

    // drain the boiled milk and chocolate
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Drained");
        }
    }

    // bring the contents to a boil
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiled");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
