package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public class GumballMachine {
    private final State soldOutState;
    private final State soldState;
    private final State hasQuarterState;
    private final State noQuarterState;
    private final State winnerState;

    private State state;

    private int count;

    GumballMachine(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        state = count > 0 ? noQuarterState : soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        count--;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Gumballs: " + count;
    }
}
