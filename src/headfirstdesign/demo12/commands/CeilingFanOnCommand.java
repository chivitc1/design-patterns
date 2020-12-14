package headfirstdesign.demo12.commands;

import headfirstdesign.demo12.Command;
import headfirstdesign.demo12.devices.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}
