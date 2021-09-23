package com.company.troops;

import com.company.damage_strategy.DamageWithBigFist;
import com.company.fly_strategy.NoFly;
import com.company.Troops;

public class Giant extends Troops {

    public Giant() {
        super(new NoFly(), new DamageWithBigFist());
    }

    @Override
    public void display() {
        System.out.println("The Giant’s first target is defenses, making them an ideal troop to deploy to get rid of defenses fast.");
    }
}
