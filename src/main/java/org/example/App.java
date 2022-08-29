package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        AutoFactory autoFactory = context.getBean("autoFactory", AutoFactory.class);
        int carsBuilt = autoFactory.runProduction();
        System.out.println(carsBuilt + " cars are built.");
    }
}
