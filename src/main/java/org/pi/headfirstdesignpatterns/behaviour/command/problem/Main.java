package org.pi.headfirstdesignpatterns.behaviour.command.problem;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        System.out.println("control light, which is in slot 1 =======");
        remoteControl.control(1, true);
        remoteControl.control(1, false);
        System.out.println("======");

        System.out.println("control hot tub, which is in slot 2 =======");
        remoteControl.control(2, true);
        remoteControl.control(2, false);
        System.out.println("======");

        System.out.println("control tv, which is in slot 3 =======");
        remoteControl.control(3, true);
        remoteControl.control(3, false);
        System.out.println("======");

        System.out.println("control stereo, which is in slot 4 =======");
        remoteControl.control(4, true);
        remoteControl.control(4, false);
        System.out.println("======");
    }
}
