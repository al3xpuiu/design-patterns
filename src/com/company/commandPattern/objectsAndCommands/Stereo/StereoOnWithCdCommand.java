package com.company.commandPattern.objectsAndCommands.Stereo;

import com.company.commandPattern.objectsAndCommands.Command;

/**
 * Created by Loky on 07/03/2019.
 */
public class StereoOnWithCdCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
