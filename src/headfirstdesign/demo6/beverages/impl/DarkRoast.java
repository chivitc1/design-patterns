package demo6.beverages.impl;

import demo6.beverages.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Cafe: Dark Roast";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
