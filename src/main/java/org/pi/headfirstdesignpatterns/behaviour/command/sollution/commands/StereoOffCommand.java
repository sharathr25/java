package org.pi.headfirstdesignpatterns.behaviour.command.sollution.commands;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Stereo;
import org.pi.headfirstdesignpatterns.behaviour.command.sollution.commands.Command;

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
