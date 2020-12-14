package demo3;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        QuackBehavior quackBehavior = new Quack();
        FlyBehavior flyBehavior = new FlyWithWings();
        Duck mallard = new MallardDuck(quackBehavior, flyBehavior);

        mallard.display();
        mallard.swim();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck(new Quack(), new FlyNoway());
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performQuack();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        DuckCall duckCall = new DuckCall(new Quack());
        duckCall.mimicQuack();
        duckCall.setQuackBehavior(new Squeak());
        duckCall.mimicQuack();
    }
}
