package com.company.fly_strategy;

public class FlyWithWings implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I am flying with wings.");
    }
}
