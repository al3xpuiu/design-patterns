package com.company.sumUDuckSimulator.behaviorsProneToChange;

/**
 * Created by DD on 11/6/2018.
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack! Quack! I'm a real duck!");
    }
}
