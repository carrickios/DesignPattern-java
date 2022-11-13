package PizzaStore;

import IngredientFactory.ChicagoPizzaIngredientFactory;
import Pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
        } else if (type.equals("pepperoni")) {

        } else if (type.equals("clam")) {
            
        } else if (type.equals("veggie")) {
            
        }
        return pizza;
    }

}
