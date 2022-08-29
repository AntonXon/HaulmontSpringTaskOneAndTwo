package org.example;

import org.example.dto.Car;
import org.springframework.stereotype.Component;

@Component("sedanPL")
public class SedanProductionLine implements ProductionLine {
    @Override
    public Car work() {
        Car car = new Car();
        System.out.println("SEDAN built");
        return car;
    }
}
