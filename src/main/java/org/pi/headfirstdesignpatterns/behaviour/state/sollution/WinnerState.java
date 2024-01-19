package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public class WinnerState implements State {
    private static final int GUMBALLS_FOR_WINNER = 2;
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("YOU’RE A WINNER! You get " + GUMBALLS_FOR_WINNER + " gumballs for your quarter");
        for (int i = 0; i < GUMBALLS_FOR_WINNER && gumballMachine.getCount() > 0; i++) {
            gumballMachine.releaseBall();
        }
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
