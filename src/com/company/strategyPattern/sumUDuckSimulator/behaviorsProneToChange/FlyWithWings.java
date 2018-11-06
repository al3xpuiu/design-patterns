package com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange;

/**
 * Created by DD on 11/6/2018.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Wings baby!");
    }
}
