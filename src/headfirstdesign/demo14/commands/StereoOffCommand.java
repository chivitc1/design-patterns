package headfirstdesign.demo14.commands;

import headfirstdesign.demo14.Command;
import headfirstdesign.demo14.devices.Stereo;

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
