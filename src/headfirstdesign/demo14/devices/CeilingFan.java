package headfirstdesign.demo14.devices;

public class CeilingFan {
    private final String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println("Ceiling fan OFF");
    }

    public void on() {
        System.out.println("Ceiling fan ON");
    }
}
