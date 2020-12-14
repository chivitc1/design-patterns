package demo6.beverages;

import demo6.beverages.Beverage;
import demo6.beverages.condiments.impl.Milk;
import demo6.beverages.condiments.impl.Mocha;
import demo6.beverages.condiments.impl.Soy;
import demo6.beverages.impl.Espresso;

public class StarbuckCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
