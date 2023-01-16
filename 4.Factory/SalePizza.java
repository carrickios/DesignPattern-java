import PizzaStore.ChicagoStylePizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.PizzaStore;
import Pizzas.Pizza;

public class SalePizza {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");

        PizzaStore chPizzaStore = new ChicagoStylePizzaStore();
        Pizza chPizza = chPizzaStore.orderPizza("cheese");
    }
    
}
