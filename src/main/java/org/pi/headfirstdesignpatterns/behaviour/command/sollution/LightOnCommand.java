package org.pi.headfirstdesignpatterns.behaviour.command.sollution;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Light;

public class LightOnCommand implements Command {

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
