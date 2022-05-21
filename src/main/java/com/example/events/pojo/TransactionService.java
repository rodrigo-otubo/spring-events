package com.example.events.pojo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends EventPublisher {

    public TransactionService(ApplicationEventPublisher applicationEventPublisher){
        super(applicationEventPublisher);
    }

    public void servicePublish(){
        publish(new Transaction("name"));
    }
}
