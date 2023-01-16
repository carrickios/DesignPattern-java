/*
 * @Author: hourui 
 * @Date: 2023-01-17 02:31:27 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-17 02:31:27 
 */
package Command;

import Receiver.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
    
}
