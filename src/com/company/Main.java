package com.company;

import com.company.strategyPattern.sumUDuckSimulator.BrokenDuck;
import com.company.strategyPattern.sumUDuckSimulator.Duck;
import com.company.strategyPattern.sumUDuckSimulator.MallardDuck;
import com.company.strategyPattern.sumUDuckSimulator.RubberDuck;
import com.company.strategyPattern.sumUDuckSimulator.behaviorsProneToChange.FlyWithRocket;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("====================");
        duck = new RubberDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        System.out.println("========================");
        duck = new BrokenDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyWithRocket());
        duck.performFly();
    }
}
