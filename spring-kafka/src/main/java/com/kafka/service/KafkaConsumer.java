package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	@KafkaListener(topics = "test-syed", groupId = "my-group")
	public void listen(String message) {
		//System.out.println("Received Message: " + message);
		log.info("Received Message: " + message);
		
	}
}
