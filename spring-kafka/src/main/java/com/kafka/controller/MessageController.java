package com.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaProducer;

@RestController
public class MessageController {

	private static final Logger logger = LoggerFactory.getLogger(MessageController.class);
	
	@Autowired
	private KafkaProducer kafkaProducer;

	@PostMapping("/send")
	public void sendMessage(@RequestBody String message) {
		logger.info("Send message : ", message);
		kafkaProducer.sendMessage(message);
	}
}
