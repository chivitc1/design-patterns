package demo2;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
