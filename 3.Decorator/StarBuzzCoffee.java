import Beverage.DarkRoast;
import Beverage.Espresso;
import Beverage.HouseBlend;
import Decorator.Mocha;
import Decorator.Whip;
import Beverage.Beverage;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = 
        new Mocha(
            new Mocha(
                new Whip(
                    new Whip(beverage3))));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        
    }
}
