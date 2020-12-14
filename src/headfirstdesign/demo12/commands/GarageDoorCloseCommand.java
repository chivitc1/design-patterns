package headfirstdesign.demo12.commands;

import headfirstdesign.demo12.Command;
import headfirstdesign.demo12.devices.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOff();
        System.out.println("----Garage door close ------");
    }
}
