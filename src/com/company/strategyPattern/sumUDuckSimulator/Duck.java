package com.company.strategyPattern.sumUDuckSimulator;

import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.FlyBehavior;
import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.QuackBehavior;

/**
 * Created by DD on 11/6/2018.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Just chilling on the water...");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
