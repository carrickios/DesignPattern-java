package PizzaStore;

import Pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {

        } else if (type.equals("clam")) {
            
        } else if (type.equals("veggie")) {
            
        }
        return pizza;
    }

}
