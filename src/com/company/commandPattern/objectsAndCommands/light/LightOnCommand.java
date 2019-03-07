package com.company.commandPattern.objectsAndCommands.light;

import com.company.commandPattern.objectsAndCommands.Command;

/**
 * Created by Loky on 13/01/2019.
 */
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
