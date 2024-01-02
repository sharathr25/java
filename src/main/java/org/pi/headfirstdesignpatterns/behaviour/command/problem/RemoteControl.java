package org.pi.headfirstdesignpatterns.behaviour.command.problem;

import org.pi.headfirstdesignpatterns.behaviour.command.common.Hottub;
import org.pi.headfirstdesignpatterns.behaviour.command.common.Light;
import org.pi.headfirstdesignpatterns.behaviour.command.common.Stereo;
import org.pi.headfirstdesignpatterns.behaviour.command.common.TV;

public class RemoteControl {
    private static final int NUMBER_OF_SLOTS_AVAILABLE = 7;
    private final Object[] slots = new Object[NUMBER_OF_SLOTS_AVAILABLE];

    public RemoteControl() {
        slots[0] = new Light();
        slots[1] = new Hottub();
        slots[2] = new TV();
        slots[3] = new Stereo();
    }

    public void control(int slotNum, boolean on) {
        switch (slotNum) {
            case 1: {
                Light light = (Light) slots[0];
                if (on) light.on();
                else light.off();
                break;
            }
            case 2: {
                Hottub hottub = (Hottub) slots[1];
                if (on) {
                    hottub.jetsOn();
                    hottub.circulate();
                    hottub.setTemperature(40);
                } else {
                    hottub.jetsOff();
                    hottub.setTemperature(0);
                }
                break;
            }
            case 3: {
                TV tv = (TV) slots[2];
                if (on) {
                    tv.on();
                    tv.setInputChannel(1);
                    tv.setVolume(5);
                } else {
                    tv.off();
                }
                break;
            }
            case 4: {
                Stereo stereo = (Stereo) slots[3];
                if (on) {
                    stereo.on();
                    stereo.setDvd();
                    stereo.setVolume(5);
                } else {
                    stereo.off();
                }
                break;
            }
            default: throw new IllegalArgumentException("Unknown Slot");
        }
    }
}
