package com.company;

import com.company.sumUDuckSimulator.BrokenDuck;
import com.company.sumUDuckSimulator.Duck;
import com.company.sumUDuckSimulator.MallardDuck;
import com.company.sumUDuckSimulator.RubberDuck;
import com.company.sumUDuckSimulator.behaviorsProneToChange.FlyWithRocket;

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
