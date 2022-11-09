// Beverage 是一个饮料抽象类  
package Beverage;

public abstract class Beverage {
    String description = "Unkonwn Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
