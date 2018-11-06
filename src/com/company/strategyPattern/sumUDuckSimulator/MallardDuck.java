package com.company.strategyPattern.sumUDuckSimulator;

import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.FlyWithWings;
import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.Quack;

/**
 * Created by DD on 11/6/2018.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looking like a mallard duck");
    }
}
