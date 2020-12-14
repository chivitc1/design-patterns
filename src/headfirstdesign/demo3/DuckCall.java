package demo3;

public class DuckCall {
    private QuackBehavior quackBehavior;

    public DuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void mimicQuack() {
        quackBehavior.quack();
    }
}
