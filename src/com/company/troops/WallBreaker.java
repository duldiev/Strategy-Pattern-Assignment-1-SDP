package com.company.troops;

import com.company.damage_strategy.DamageWithBomb;
import com.company.fly_strategy.NoFly;
import com.company.Troops;

public class WallBreaker extends Troops {

    public WallBreaker() {
        super(new NoFly(), new DamageWithBomb());
    }

    @Override
    public void display() {
        System.out.println("The Wall Breaker attacks by locating the nearest protected building and destroying its protective Walls, blowing itself up in the process.");
    }
}
