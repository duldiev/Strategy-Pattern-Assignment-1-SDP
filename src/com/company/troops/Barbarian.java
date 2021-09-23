package com.company.troops;

import com.company.damage_strategy.DamageWithSword;
import com.company.fly_strategy.NoFly;
import com.company.Troops;

public class Barbarian extends Troops {

    public Barbarian() {
        super(new NoFly(), new DamageWithSword());
    }

    @Override
    public void display() {
        System.out.println("Barbarian appears as a male kilt-clad warrior with an angry, battle-ready expression, hungry for destruction.");
    }
}
