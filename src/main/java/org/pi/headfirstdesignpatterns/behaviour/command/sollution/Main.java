package org.pi.headfirstdesignpatterns.behaviour.command.sollution;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Light;
import org.pi.headfirstdesignpatterns.behaviour.command.common.Stereo;
import org.pi.headfirstdesignpatterns.behaviour.command.sollution.commands.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffCommand);

        Command[] partyOnCommands = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOffCommands = {lightOffCommand, stereoOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOnCommands);
        MacroCommand partyOffMacro = new MacroCommand(partyOffCommands);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        remoteControl.onBtnPushed(1);
        remoteControl.offBtnPushed(1);
    }
}
