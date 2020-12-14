package headfirstdesign.demo14;

import headfirstdesign.demo14.commands.*;
import headfirstdesign.demo14.devices.*;

public class RemoteControlDemo {
    public static void main(String[] args) {
        headfirstdesign.demo14.RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomLightOn, ceilingFanOn, stereoOnWithCD};
        Command partyOnMacro = new MacroCommand(partyOn);
        Command[] partyOff = {livingRoomLightOff, ceilingFanOff, stereoOff};
        Command partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(5, partyOnMacro, partyOffMacro);
        remote.onButtonWasPushed(5);
    }
}
