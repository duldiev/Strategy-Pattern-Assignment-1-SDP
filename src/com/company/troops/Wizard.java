package com.company.troops;

import com.company.damage_strategy.DamageWithFire;
import com.company.damage_strategy.DamageWithFireBall;
import com.company.fly_strategy.NoFly;
import com.company.Troops;

public class Wizard extends Troops {

    public Wizard() {
        super(new NoFly(), new DamageWithFireBall());
    }

    @Override
    public void display() {
        System.out.println("Wizard shoots fireballs or energy blasts that do high damage but requires support as he has relatively low hit points and can easily be killed by point defenses.");
    }
}
