package com.company.commandPattern.objectsAndCommands;

/**
 * Created by Loky on 13/01/2019.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command has been set in this slot of the Remote");
    }
}
