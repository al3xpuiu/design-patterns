package com.company.adapterPattern.duckTurkeyExample;

/**
 * Created by Loky on 12/03/2019.
 */
public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
