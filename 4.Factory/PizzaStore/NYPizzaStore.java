package PizzaStore;

import Pizzas.*;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {

        } else if (type.equals("clam")) {
            
        } else if (type.equals("veggie")) {
            
        }
        return pizza;
    }
    
}
