package com.company.sumUDuckSimulator.behaviorsProneToChange;

/**
 * Created by DD on 11/6/2018.
 */
public class Squek implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squek! I'm not a real duck!");
    }
}
