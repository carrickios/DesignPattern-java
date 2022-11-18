/*
 * @Author: hourui 
 * @Date: 2022-11-18 08:43:50 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2022-11-18 08:43:50 
 */

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler () {
        empty = true;
        boiled = false;
    };

    public static ChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }



}