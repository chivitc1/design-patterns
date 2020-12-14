package demo11.commands.garagedoor;

import demo11.Command;
import demo11.homeauto.GarageDoor;

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
        System.out.println("-------Garage door open------");
    }
}
