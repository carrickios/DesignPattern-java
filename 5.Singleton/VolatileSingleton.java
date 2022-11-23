/*
 * @Author: hourui 
 * @Date: 2022-11-18 08:57:21 
 * @Last Modified by: hourui
 * @Last Modified time: 2022-11-18 08:59:29
 */

public class VolatileSingleton {
    // volatile 关键字确保 当uniqueInstance被初始化成VolatileSingleton实例时，多个线程正确处理uniqueInstance变量
    private volatile static VolatileSingleton uniqueInstance;

    private VolatileSingleton() {};

    public static VolatileSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (VolatileSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new VolatileSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void otherMethod() {

    }
}
