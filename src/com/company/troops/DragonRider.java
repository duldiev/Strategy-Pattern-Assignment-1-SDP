package com.company.troops;

import com.company.damage_strategy.DamageWithFire;
import com.company.damage_strategy.DamageWithFireBall;
import com.company.fly_strategy.FlyWithMechanizedWings;
import com.company.Troops;

public class DragonRider extends Troops {

    public DragonRider() {
        super(new FlyWithMechanizedWings(), new DamageWithFireBall());
    }

    @Override
    public void display() {
        System.out.println("The Dragon Rider is a mechanized dragon ridden by a skeleton that prioritizes defenses.");
    }
}
