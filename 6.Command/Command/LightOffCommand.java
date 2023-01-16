/*
 * @Author: hourui 
 * @Date: 2023-01-17 02:31:27 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-17 02:31:27 
 */
package Command;

import Receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
    
}
