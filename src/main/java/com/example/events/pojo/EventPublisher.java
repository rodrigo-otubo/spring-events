package com.example.events.pojo;

import org.springframework.context.ApplicationEventPublisher;

public class EventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    protected void publish(Object obj){
        applicationEventPublisher.publishEvent(obj);
    }

}
