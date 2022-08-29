package org.example.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CarEventListener implements ApplicationListener<CarEvent> {
    @Override
    public void onApplicationEvent(CarEvent event) {
        System.out.println("Car event received: " + event.getMessage());
    }
}
