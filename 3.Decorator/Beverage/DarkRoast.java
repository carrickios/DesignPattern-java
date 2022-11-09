package Beverage;


/**
 * DarkRoast
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.25;
    }
    
}