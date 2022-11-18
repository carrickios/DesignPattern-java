/*
 * @Author: hourui 
 * @Date: 2022-11-18 08:52:03 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2022-11-18 08:52:03 
 * 线程安全 每次访问单例都会造成线程同步的问题 有一定性能问题
 */


public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }

    public void otherMethod() {
        
    }
}
