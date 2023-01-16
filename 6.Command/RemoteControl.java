import Command.Command;
import Command.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private int commandCount = 7;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[commandCount];
        offCommands = new Command[commandCount];

        Command noCommand = new NoCommand();
        for (int i = 0; i < commandCount; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }
    
    public void setCommand(int slotIndex, Command onCommand, Command offCommand) throws Exception {
        if (slotIndex < 0 || slotIndex >= commandCount) {
            throw new Exception("slotIndex out of range");
        }

        onCommands[slotIndex] = onCommand;
        offCommands[slotIndex] = offCommand;
    }

    public void onButtonWasPushed(int slotIndex)  throws Exception {
        if (slotIndex < 0 || slotIndex >= commandCount) {
            throw new Exception("slotIndex out of range");
        }

        onCommands[slotIndex].execute();
        undoCommand = onCommands[slotIndex];
    }

    public void offButtonWasPushed(int slotIndex)  throws Exception {
        if (slotIndex < 0 || slotIndex >= commandCount) {
            throw new Exception("slotIndex out of range");
        }

        offCommands[slotIndex].execute();
        undoCommand = offCommands[slotIndex];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
