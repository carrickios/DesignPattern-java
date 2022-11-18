/*
 * @Author: hourui 
 * @Date: 2022-11-18 08:39:35 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2022-11-18 08:39:35 
 * 一种比较通用的
 */



public class Singleton {
    
    private static Singleton uniqueInstance;

    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void otherMethod() {
        
    }

}