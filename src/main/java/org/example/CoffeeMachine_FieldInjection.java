package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CoffeeMachine_FieldInjection {
    @Autowired  // Field Injection
    private WaterPump waterPump;

    void makeCoffee() {
        waterPump.pumpWater();
        System.out.println("☕ Coffee is being brewed!");
    }
}
