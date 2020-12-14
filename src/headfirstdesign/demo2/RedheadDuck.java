package demo2;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
