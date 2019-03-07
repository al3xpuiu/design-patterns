package com.company.commandPattern.remoteControlls;

import com.company.commandPattern.objectsAndCommands.Command;
import com.company.commandPattern.objectsAndCommands.NoCommand;

/**
 * Created by Loky on 13/01/2019.
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        this.onCommands[slot].execute();
        this.undoCommand = this.onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        this.offCommands[slot].execute();
        this.undoCommand = this.offCommands[slot];
    }

    public void undoButtonWasPressed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(  );
        builder.append( "\n --------- Remote Control --------- \n" );
        for (int i = 0; i < 7; i++) {
            String onCommand = onCommands[i].getClass().getName();
            String offCommand = offCommands[i].getClass().getName();
            builder.append( "slot " )
                    .append( i )
                    .append( ": " )
                    .append( onCommand )
                    .append( ", " )
                    .append( offCommand );
        }

        return builder.toString();
    }
}
