package demo7.pizzas;

import demo7.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("------------Start crafting----------");
        System.out.println("Prepare: cheese pizza");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("Bake");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("Cut");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("Box");
        System.out.println("------------Finish crafting----------");
        return this;
    }
}
