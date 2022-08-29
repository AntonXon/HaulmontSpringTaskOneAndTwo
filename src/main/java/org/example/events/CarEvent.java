package org.example.events;

import org.springframework.context.ApplicationEvent;

public class CarEvent extends ApplicationEvent {
    private String message;

    public CarEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
