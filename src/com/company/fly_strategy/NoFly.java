package com.company.fly_strategy;

public class NoFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
