package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CoffeeMachine_SetterInjection {
    private WaterPump waterPump;

    @Autowired  // Setter Injection
    public void setWaterPump(WaterPump waterPump) {
        this.waterPump = waterPump;
    }

    void makeCoffee() {
        waterPump.pumpWater();
        System.out.println("☕ Coffee is being brewed!");
    }
}
