package demo9;

import demo9.ingredients.Cheese;
import demo9.ingredients.Dough;
import demo9.ingredients.Pepperoni;
import demo9.ingredients.Sauce;

public abstract class Pizza {
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Pepperoni pepperoni;
    protected Cheese cheese;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official Store box");
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}
