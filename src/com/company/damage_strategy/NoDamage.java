package com.company.damage_strategy;

public class NoDamage implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I can't hurt anyone)");
    }
}
