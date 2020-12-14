package headfirstdesign.demo12.commands;

import headfirstdesign.demo12.Command;
import headfirstdesign.demo12.devices.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.stop();
        garageDoor.lightOn();
        System.out.println("----Garage door open ------");
    }
}
