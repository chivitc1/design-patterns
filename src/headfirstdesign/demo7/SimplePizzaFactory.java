package demo7;

import demo7.pizzas.CheesePizza;
import demo7.pizzas.PepperoniPizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza();
        }
        throw new RuntimeException("Unsupported type: " + type);
    }
}
