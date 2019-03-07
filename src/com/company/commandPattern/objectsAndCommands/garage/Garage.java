package com.company.commandPattern.objectsAndCommands.garage;

/**
 * Created by Loky on 13/01/2019.
 */
public class Garage {

    void up() {
        System.out.println("Opening the garage doors");
    }

    void down() {
        System.out.println("Closing the garage doors");
    }

    void stop() {
        System.out.println("Stopping the garage doors");
    }

    void lightOn() {
        System.out.println("Turing the lights on");
    }

    void lightOff() {
        System.out.println("Turing the objectsAndCommands off");
    }
}
