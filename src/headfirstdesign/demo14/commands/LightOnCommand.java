package headfirstdesign.demo14.commands;

import headfirstdesign.demo14.Command;
import headfirstdesign.demo14.devices.Light;

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
