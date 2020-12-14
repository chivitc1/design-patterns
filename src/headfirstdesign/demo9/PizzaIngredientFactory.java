package demo9;

import demo9.ingredients.Cheese;
import demo9.ingredients.Dough;
import demo9.ingredients.Pepperoni;
import demo9.ingredients.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();

    Cheese createCheese();

    Pepperoni createPepperoni();

    Sauce createSauce();
}
