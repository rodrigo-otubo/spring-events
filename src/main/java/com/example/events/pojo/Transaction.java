package com.example.events.pojo;

import org.springframework.context.ApplicationEvent;

public class Transaction{

    private String name;

    public Transaction(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
