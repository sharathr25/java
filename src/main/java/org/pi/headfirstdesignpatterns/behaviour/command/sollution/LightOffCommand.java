package org.pi.headfirstdesignpatterns.behaviour.command.sollution;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
