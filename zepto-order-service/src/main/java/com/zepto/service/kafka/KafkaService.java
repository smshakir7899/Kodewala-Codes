package com.zepto.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService
{
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void storingMessage(String topic, String message)
	{
		System.out.println("KafkaService.storingMessage()::::::::: SENDING MSGTO KAFKA");

		String key = "ORD-1";
		kafkaTemplate.send(topic, key, message);
	}
}
