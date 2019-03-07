package com.company.commandPattern.objectsAndCommands.light;

import com.company.commandPattern.objectsAndCommands.Command;

/**
 * Created by Loky on 07/03/2019.
 */
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
