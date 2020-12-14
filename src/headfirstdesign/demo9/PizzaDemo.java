package demo9;

import demo9.stores.ChicagoPizzaStore;
import demo9.stores.NYPizzaStore;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        nyStore.orderPizza("pepperoni");

        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("pepperoni");
    }
}
