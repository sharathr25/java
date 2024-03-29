package org.pi.headfirstdesignpatterns.behaviour.command.sollution.commands;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Stereo;
import org.pi.headfirstdesignpatterns.behaviour.command.sollution.commands.Command;

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(5);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
