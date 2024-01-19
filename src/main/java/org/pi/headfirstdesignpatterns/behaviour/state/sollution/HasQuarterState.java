package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        boolean isWinner = randomWinner.nextInt(10) == 0;
        gumballMachine.setState(isWinner
                ? gumballMachine.getWinnerState()
                : gumballMachine.getSoldState()
        );
    }

    @Override
    public void dispense() {
        System.out.println("No Gumball dispensed");
    }
}
