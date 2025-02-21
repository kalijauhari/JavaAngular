package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CoffeeMachine {
    private final WaterPump waterPump;

    @Autowired  // Constructor Injection
    public CoffeeMachine(WaterPump waterPump) {
        this.waterPump = waterPump;
    }

    void makeCoffee() {
        waterPump.pumpWater();
        System.out.println("☕ Coffee is being brewed!");
    }
}
