package demo3;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Rubber duck squeak");
    }
}
