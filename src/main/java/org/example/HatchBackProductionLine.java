package org.example;

public class HatchBackProductionLine implements ProductionLine {
    @Override
    public Car work() {
        Car car = new Car();
        System.out.println("HATCHBACK built");
        return car;
    }
}
