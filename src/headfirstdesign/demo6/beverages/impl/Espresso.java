package demo6.beverages.impl;

import demo6.beverages.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Cafe: Espresso";
    }
    @Override
    public double cost() {
        return 7.00;
    }
}
