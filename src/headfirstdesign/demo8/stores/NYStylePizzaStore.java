package demo8.stores;

import demo8.Pizza;
import demo8.PizzaStore;
import demo8.pizzas.NYStyleCheesePizza;
import demo8.pizzas.NYStylePepperoniPizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new NYStylePepperoniPizza();
        }
        throw new RuntimeException("Unsupported type: " + type);
    }
}
