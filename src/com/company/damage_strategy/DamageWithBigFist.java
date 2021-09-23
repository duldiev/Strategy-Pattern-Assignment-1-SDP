package com.company.damage_strategy;

public class DamageWithBigFist implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I am destroying with my giant hand!");
    }
}
