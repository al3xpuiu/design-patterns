package com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange;

/**
 * Created by DD on 11/6/2018.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
