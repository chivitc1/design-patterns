package headfirstdesign.demo12.commands;

import headfirstdesign.demo12.Command;
import headfirstdesign.demo12.devices.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
