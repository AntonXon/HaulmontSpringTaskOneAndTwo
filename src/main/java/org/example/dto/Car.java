package org.example.dto;

import java.util.Random;

public class Car {
    private boolean partsDelivered;

    public Car() {
        Random random = new Random();
        partsDelivered = random.nextBoolean();
    }

    public boolean isPartsDelivered() {
        return partsDelivered;
    }

    public void setPartsDelivered(boolean partsDelivered) {
        this.partsDelivered = partsDelivered;
    }
}
