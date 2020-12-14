package demo9.ingredients.newyork;

import demo9.PizzaIngredientFactory;
import demo9.ingredients.*;
import demo9.ingredients.chicago.MarinaraSauce;
import demo9.ingredients.SlicedPepperoni;

public class NYIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new RegginoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
