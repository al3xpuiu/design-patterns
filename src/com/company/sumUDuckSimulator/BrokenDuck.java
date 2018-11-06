package com.company.sumUDuckSimulator;

import com.company.sumUDuckSimulator.behaviorsProneToChange.FlyNoWay;
import com.company.sumUDuckSimulator.behaviorsProneToChange.MuteQuack;

/**
 * Created by DD on 11/6/2018.
 */
public class BrokenDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Looking like shit");
    }

    public BrokenDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
}
