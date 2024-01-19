package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
