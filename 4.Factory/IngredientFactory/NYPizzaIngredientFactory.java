package IngredientFactory;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Pepperoni;
import Ingredient.Sauce;
import Ingredient.Veggies;
import Ingredient.Veggie.Garlic;
import Ingredient.Veggie.Mushroom;
import Ingredient.Veggie.Onion;
import Ingredient.Veggie.RedPepper;
import Ingredient.extend.FreshClams;
import Ingredient.extend.MarinaraSauce;
import Ingredient.extend.ReggianoCheese;
import Ingredient.extend.SlicedPepperoni;
import Ingredient.extend.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies viggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return viggies;
    }

    @Override
    public Pepperoni createPapperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
    
}
