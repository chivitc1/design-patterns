package demo9.ingredients.chicago;

import demo9.PizzaIngredientFactory;
import demo9.ingredients.Cheese;
import demo9.ingredients.Dough;
import demo9.ingredients.Pepperoni;
import demo9.ingredients.Sauce;
import demo9.ingredients.SlicedPepperoni;
import demo9.ingredients.newyork.TomatoSauce;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
