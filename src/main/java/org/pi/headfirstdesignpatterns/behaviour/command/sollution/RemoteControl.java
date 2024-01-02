package org.pi.headfirstdesignpatterns.behaviour.command.sollution;

public class RemoteControl {
    private static final int NUMBER_OF_SLOTS_AVAILABLE = 7;
    private final Command[] onCommands;
    private final Command[] offCommands;

    RemoteControl() {
        onCommands = new Command[NUMBER_OF_SLOTS_AVAILABLE];
        offCommands = new Command[NUMBER_OF_SLOTS_AVAILABLE];

        for (int i = 0; i < NUMBER_OF_SLOTS_AVAILABLE; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        if (slot > NUMBER_OF_SLOTS_AVAILABLE - 1)
            throw new IllegalArgumentException("Invalid Slot Number");

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onBtnPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offBtnPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("==== Remote ====\n");
        for (int i = 0; i < NUMBER_OF_SLOTS_AVAILABLE; i++) {
            stringBuilder.append(String.format("[slot %s] | %s - %s\n",
                    i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()));
        }
        return stringBuilder.toString();
    }
}
