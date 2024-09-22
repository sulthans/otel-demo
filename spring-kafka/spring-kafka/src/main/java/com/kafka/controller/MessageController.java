package com.kafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.KafkaProducer;

@RestController
public class MessageController {
	@Autowired
	private KafkaProducer kafkaProducer;

	@PostMapping("/send")
	public void sendMessage(@RequestBody String message) {
		kafkaProducer.sendMessage(message);
	}
}
