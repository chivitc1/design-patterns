package demo8.pizzas;

import demo8.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra thick Crust dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarel Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
