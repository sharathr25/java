package org.pi.headfirstdesignpatterns.behaviour.templatemethod.problem;

public class Coffee {
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        addSugarAndMilk();
        pourInCup();
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}
