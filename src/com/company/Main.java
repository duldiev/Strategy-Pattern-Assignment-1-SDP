package com.company;

import com.company.troops.Archer;
import com.company.troops.DragonRider;
import com.company.troops.Healer;

// All characters are taken from Clash of Clans

public class Main {

    public static void main(String[] args) {
        Troops archer = new Archer();
        archer.display();
        archer.performFLy();
        archer.performDamage();

        Troops healer = new Healer();
        healer.display();
        healer.performFLy();
        healer.performDamage();

        Troops dragonRider = new DragonRider();
        dragonRider.display();
        dragonRider.performFLy();
        dragonRider.performDamage();
    }
}
