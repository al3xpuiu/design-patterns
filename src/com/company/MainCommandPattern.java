package com.company;

import com.company.commandPattern.objectsAndCommands.garage.Garage;
import com.company.commandPattern.objectsAndCommands.garage.GarageDoorOpenCommand;
import com.company.commandPattern.objectsAndCommands.light.Light;
import com.company.commandPattern.objectsAndCommands.light.LightOnCommand;
import com.company.commandPattern.remoteControlls.SimpleRemoteControl;

/**
 * Created by Loky on 13/01/2019.
 */
public class MainCommandPattern {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(  );
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand( light );

        remote.setSlot1( lightOnCommand );
        remote.pressButton1();

        Garage garage = new Garage();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand( garage );

        remote.setSlot2( doorOpenCommand );
        remote.pressButton2();
    }
}
