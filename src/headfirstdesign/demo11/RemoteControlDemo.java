package demo11;

import demo11.commands.garagedoor.GarageDoorOpenCommand;
import demo11.commands.light.LightOnCommand;
import demo11.homeauto.GarageDoor;
import demo11.homeauto.Light;

public class RemoteControlDemo {
    public static void main(String[] args) {

        // Create an invoker (remote control)
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Create command receiver
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Setup command: create a command and pass the receiver to it
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        // Pass command to invoker (remote control)
        remote.setCommand(lightOn);
        // invoker invoke command to execute action
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
