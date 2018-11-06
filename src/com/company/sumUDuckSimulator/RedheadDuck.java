package com.company.sumUDuckSimulator;

import com.company.sumUDuckSimulator.behaviorsProneToChange.FlyWithWings;
import com.company.sumUDuckSimulator.behaviorsProneToChange.Quack;

/**
 * Created by DD on 11/6/2018.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Just a redhead duck");
    }
}
