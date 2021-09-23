package com.company;

import com.company.damage_strategy.DamageStrategy;
import com.company.fly_strategy.FlyStrategy;

public abstract class Troops {
    FlyStrategy flyStrategy;
    DamageStrategy damageStrategy;

    public Troops(FlyStrategy flyStrategy, DamageStrategy damageStrategy) {
        this.flyStrategy = flyStrategy;
        this.damageStrategy = damageStrategy;
    }

    public abstract void display();

    public void performFLy() {
        this.flyStrategy.fly();
    }

    public void performDamage() {
        this.damageStrategy.damage();
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setDamageStrategy(DamageStrategy damageStrategy) {
        this.damageStrategy = damageStrategy;
    }
}
