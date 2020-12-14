package demo8.stores;

import demo8.Pizza;
import demo8.PizzaStore;
import demo8.pizzas.ChicagoStyleCheesePizza;
import demo8.pizzas.ChicagoStylePepperoniPizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(type)) {
            return new ChicagoStylePepperoniPizza();
        }
        throw new RuntimeException("Unsupported type: " + type);
    }
}
