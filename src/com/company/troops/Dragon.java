package com.company.troops;

import com.company.damage_strategy.DamageWithFire;
import com.company.fly_strategy.FlyWithWings;
import com.company.Troops;

public class Dragon extends Troops {

    public Dragon() {
        super(new FlyWithWings(), new DamageWithFire());
    }

    @Override
    public void display() {
        System.out.println("Dragon is a fearsome flying unit capable of attacking both ground and air units.");
    }
}
