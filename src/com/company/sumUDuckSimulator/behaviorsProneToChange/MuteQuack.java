package com.company.sumUDuckSimulator.behaviorsProneToChange;

/**
 * Created by DD on 11/6/2018.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Can't Quack. Don't know why.");
    }
}
