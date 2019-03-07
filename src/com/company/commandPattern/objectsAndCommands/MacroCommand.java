package com.company.commandPattern.objectsAndCommands;

/**
 * Created by Loky on 07/03/2019.
 */
public class MacroCommand implements Command {

    private Command[] onCommands;

    public MacroCommand(Command[] onCommands) {
        this.onCommands = onCommands;
    }

    @Override
    public void execute() {
        for (Command command : onCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : onCommands) {
            command.undo();
        }
    }
}
