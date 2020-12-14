package headfirstdesign.demo12.devices;

public class Light {
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location.toUpperCase() + ": Light OFF");
    }

    public void on() {
        System.out.println(location.toUpperCase() + ": Light ON");
    }
}
