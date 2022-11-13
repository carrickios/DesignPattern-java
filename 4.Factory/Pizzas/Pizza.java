package Pizzas;
import java.util.ArrayList;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Pepperoni;
import Ingredient.Sauce;
import Ingredient.Veggies;

public abstract class Pizza {
    
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    ArrayList <String>toppings = new ArrayList<>();
    
    public abstract void prepare();
    
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

}
