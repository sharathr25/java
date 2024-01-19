package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, You already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't give another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        gumballMachine.setState(gumballMachine.getCount() > 0
                ? gumballMachine.getNoQuarterState()
                : gumballMachine.getSoldOutState()
        );
    }
}
