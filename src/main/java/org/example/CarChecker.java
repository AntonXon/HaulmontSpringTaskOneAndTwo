package org.example;

import org.example.dto.Car;
import org.springframework.stereotype.Component;

@Component
public class CarChecker {
    public boolean checkCar(Car car) {
        return car.isPartsDelivered();
    }
}
