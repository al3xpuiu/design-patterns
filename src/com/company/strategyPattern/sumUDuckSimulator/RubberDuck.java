package com.company.strategyPattern.sumUDuckSimulator;

import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.FlyNoWay;
import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.Squek;

/**
 * Created by DD on 11/6/2018.
 */
// doesn't quack, nor fly
public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squek());
    }

    @Override
    public void display() {
        System.out.println("One ugly rubber duck");
    }
}
