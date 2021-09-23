package com.company.damage_strategy;

public class DamageWithFireBall implements DamageStrategy {
    @Override
    public void damage() {
        System.out.println("I am firing with my magic fire ball!");
    }
}
