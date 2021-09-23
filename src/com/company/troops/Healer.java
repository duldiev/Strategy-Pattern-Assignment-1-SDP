package com.company.troops;

import com.company.fly_strategy.FlyWithWings;
import com.company.damage_strategy.NoDamage;
import com.company.Troops;

public class Healer extends Troops {

    public Healer() {
        super(new FlyWithWings(), new NoDamage());
    }

    @Override
    public void display() {
        System.out.println("Healer is the only troop with no attacking capabilities, but can heal any ground troops.");
    }
}
