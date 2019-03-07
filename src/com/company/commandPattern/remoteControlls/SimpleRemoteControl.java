package com.company.commandPattern.remoteControlls;

import com.company.commandPattern.objectsAndCommands.Command;

/**
 * Created by Loky on 13/01/2019.
 */
public class SimpleRemoteControl {

    private Command slot1;
    private Command slot2;

    public void setSlot1(Command command) {
        this.slot1 = command;
    }

    public void setSlot2(Command slot2) {
        this.slot2 = slot2;
    }

    public void pressButton1() {
        this.slot1.execute();
    }

    public void pressButton2() {
        this.slot2.execute();
    }
}
