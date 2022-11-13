package PizzaStore;

import IngredientFactory.NYPizzaIngredientFactory;
import Pizzas.*;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(new NYPizzaIngredientFactory());
        } else if (type.equals("pepperoni")) {

        } else if (type.equals("clam")) {
            
        } else if (type.equals("veggie")) {
            
        }
        return pizza;
    }
    
}
