package headfirstdesign.demo13;

public class RemoteControlWithUndoDemo {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();
        lightOnCommand.undo();
    }
}
