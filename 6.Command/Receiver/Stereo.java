/*
 * @Author: hourui 
 * @Date: 2023-01-17 02:56:04 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-17 02:56:04 
 * 
 * 音响类 
 */
package Receiver;

public class Stereo {

    private String name;
    private int voluem = 0;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo on");
    }

    public void off() {
        System.out.println(name + " Stereo off");
    }

    public void setCd() {
        System.out.println(name + " Stereo setCd");
    }

    public void setDVD() {
        System.out.println(name + " Stereo setDVD");
    }

    public void setRadio() {
        System.out.println(name + " Stereo setRadio");
    }

    public void setVolume(int voluem) {
        this.voluem = voluem;
        System.out.println(name + " Stereo setVolume" + voluem);
    }
}
