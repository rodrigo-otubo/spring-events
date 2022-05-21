package com.example.events;

import com.example.events.pojo.Transaction;
import com.example.events.pojo.EventPublisher;
import com.example.events.pojo.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EventsApplication {

	@Autowired
	TransactionService service;

	public static void main(String[] args) { SpringApplication.run(EventsApplication.class, args); }

	@PostConstruct
	void publish(){
		service.servicePublish();
	}
}
