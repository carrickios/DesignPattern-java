import Command.LightOffCommand;
import Command.LightOnCommand;
import Command.StereoOffWithCDCommand;
import Command.StereoOnWithCDCommand;
import Receiver.Light;
import Receiver.Stereo;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        try {
            remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
            remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);
        } catch (Exception e) {
            
        }

        try {
            remoteControl.onButtonWasPushed(0);
            remoteControl.onButtonWasPushed(1);
            
            remoteControl.offButtonWasPushed(0);
            remoteControl.offButtonWasPushed(1);
        } catch (Exception e) {
            
        }
        
        remoteControl.undoButtonWasPushed();

    }
}
