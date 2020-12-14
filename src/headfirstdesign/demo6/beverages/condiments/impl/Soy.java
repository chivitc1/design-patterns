package demo6.beverages.condiments.impl;

import demo6.beverages.Beverage;
import demo6.beverages.condiments.CondimentDecorator;

public class Soy extends CondimentDecorator {
    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Soy";
    }
}
