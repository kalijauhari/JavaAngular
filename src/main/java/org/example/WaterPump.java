package org.example;

import org.springframework.stereotype.Component;

@Component
class WaterPump {
    void pumpWater() {
        System.out.println("💧 Water is being pumped...");
    }
}
