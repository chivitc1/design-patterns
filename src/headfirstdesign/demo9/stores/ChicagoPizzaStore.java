package demo9.stores;

import demo9.Pizza;
import demo9.PizzaIngredientFactory;
import demo9.PizzaStore;
import demo9.ingredients.chicago.ChicagoIngredientFactory;
import demo9.pizzas.CheesePizza;
import demo9.pizzas.PeperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza");
            return pizza;
        } else if ("pepperoni".equals(type)) {
            pizza = new PeperoniPizza(ingredientFactory);
            pizza.setName("Chicago style pepperoni pizza");
            return pizza;
        }

        throw new RuntimeException("Unsupported type " + type);
    }
}
