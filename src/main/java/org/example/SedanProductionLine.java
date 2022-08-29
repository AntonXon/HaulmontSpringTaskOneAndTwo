package org.example;

public class SedanProductionLine implements ProductionLine {
    @Override
    public Car work() {
        Car car = new Car();
        System.out.println("SEDAN built");
        return car;
    }
}
