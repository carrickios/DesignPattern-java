package Pizzas;


public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Sharedded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("cutting the pizza into square slices");
    }
    
}
