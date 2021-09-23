package com.company.troops;

import com.company.damage_strategy.DamageWithLongBow;
import com.company.fly_strategy.NoFly;
import com.company.Troops;

public class Archer extends Troops {

    public Archer() {
        super(new NoFly(), new DamageWithLongBow());
    }

    @Override
    public void display() {
        System.out.println("The Archer is a female warrior with sharp eyes.");
    }
}
