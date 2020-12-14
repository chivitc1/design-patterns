package demo6.beverages.condiments.impl;

import demo6.beverages.Beverage;
import demo6.beverages.condiments.CondimentDecorator;

public class Milk extends CondimentDecorator {
    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Milk";
    }
}
