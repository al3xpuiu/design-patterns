package com.company.commandPattern.objectsAndCommands.garage;

import com.company.commandPattern.objectsAndCommands.Command;

/**
 * Created by Loky on 13/01/2019.
 */
public class GarageDoorOpenCommand implements Command {

    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        this.garage.up();
    }

    @Override
    public void undo() {

    }

}
