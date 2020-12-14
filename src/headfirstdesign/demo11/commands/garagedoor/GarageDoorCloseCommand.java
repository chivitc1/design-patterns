package demo11.commands.garagedoor;

import demo11.Command;
import demo11.homeauto.GarageDoor;

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
        System.out.println("-------Garage door closed------");
    }
}
