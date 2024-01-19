package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public class Shop {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        print(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        print(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        print(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        print(gumballMachine);

        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
    }

    public static void print(GumballMachine gumballMachine) {
        System.out.println();
        System.out.println("-------------");
        System.out.println(gumballMachine);
        System.out.println("-------------");
        System.out.println();
    }
}
