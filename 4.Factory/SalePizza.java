import PizzaStore.ChicagoStylePizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.PizzaStore;

public class SalePizza {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chPizzaStore = new ChicagoStylePizzaStore();
        chPizzaStore.orderPizza("cheese");
    }
    
}
