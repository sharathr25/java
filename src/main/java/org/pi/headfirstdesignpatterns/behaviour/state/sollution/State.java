package org.pi.headfirstdesignpatterns.behaviour.state.sollution;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
