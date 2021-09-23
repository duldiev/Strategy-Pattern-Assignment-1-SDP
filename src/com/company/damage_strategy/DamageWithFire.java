package com.company.damage_strategy;

public class DamageWithFire implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I am firing!!!");
    }
}
