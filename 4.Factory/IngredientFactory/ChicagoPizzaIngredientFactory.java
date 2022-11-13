package IngredientFactory;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Pepperoni;
import Ingredient.Sauce;
import Ingredient.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        
        return null;
    }

    @Override
    public Sauce createSauce() {
        
        return null;
    }

    @Override
    public Cheese createCheese() {
        
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        
        return null;
    }

    @Override
    public Pepperoni createPapperoni() {
        
        return null;
    }

    @Override
    public Clams createClams() {

        return null;
    }
    
}
