package demo6.beverages.condiments.impl;

import demo6.beverages.Beverage;
import demo6.beverages.condiments.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    protected Beverage beverage;

    //Wrapper Beverage
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Mocha";
    }
}
