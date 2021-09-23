package com.company.troops;

import com.company.damage_strategy.DamageWithBomb;
import com.company.fly_strategy.FlyWithAirBalloon;
import com.company.Troops;

public class Balloon extends Troops {

    public Balloon() {
        super(new FlyWithAirBalloon(), new DamageWithBomb());
    }

    @Override
    public void display() {
        System.out.println("Balloons are \"promoted\" Wall Breakers that now attack from a hot air balloon.");
    }
}
