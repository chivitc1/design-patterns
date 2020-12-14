package demo7;

public class PizzaDemo {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        String type = "cheese";
        store.orderPizza(type);
        type = "pepperoni";
        store.orderPizza(type);
    }
}
