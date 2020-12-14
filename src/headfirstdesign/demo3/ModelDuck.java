package demo3;

public class ModelDuck extends Duck {
    public ModelDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
    @Override
    public void display() {
        System.out.println("Display: model duck");
    }
}
