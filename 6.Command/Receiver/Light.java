/*
 * @Author: hourui 
 * @Date: 2023-01-17 02:31:09 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-17 02:31:09 
 * 
 * 点灯类
 */
package Receiver;



public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light on");
    }

    public void off() {
        System.out.println(name + " Light off");
    }
    
}
