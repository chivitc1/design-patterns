package demo9.pizzas;

import demo9.Pizza;
import demo9.PizzaIngredientFactory;

public class PeperoniPizza extends Pizza {
    private final PizzaIngredientFactory ingredientFactory;

    public PeperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
