package demo8;

public abstract class PizzaStore {

    /**
     * Abstract Factory method
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
