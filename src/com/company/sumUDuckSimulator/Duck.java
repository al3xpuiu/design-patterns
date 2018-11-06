package com.company.sumUDuckSimulator;

import com.company.sumUDuckSimulator.behaviorsProneToChange.FlyBehavior;
import com.company.sumUDuckSimulator.behaviorsProneToChange.QuackBehavior;

/**
 * Created by DD on 11/6/2018.
 */
public class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("Just chilling on the water...");
    }

    public void display() {
        System.out.println("Ugly duck");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
