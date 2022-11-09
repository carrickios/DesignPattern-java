package Beverage;
// 浓缩咖啡

public class Espresso extends Beverage {

    public Espresso() {
        description = "Esprosso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
