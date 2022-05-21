package com.example.events.pojo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionEventListener {
    
    @EventListener
    public void onApplicationEvent(final Object transaction){
        System.out.println("transaction.getName()");
    }
}
