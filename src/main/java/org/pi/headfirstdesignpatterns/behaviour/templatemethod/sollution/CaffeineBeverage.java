package org.pi.headfirstdesignpatterns.behaviour.templatemethod.sollution;

public abstract class CaffeineBeverage {
    public void prepareRecipe() { // template method
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();

    boolean customerWantsCondiments() { // hook, subclass can implement its own
        return true;
    }
}
