package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        int carsBuilt = autoFactory.runProduction();
        System.out.println(carsBuilt + " cars are built.");
    }
}
