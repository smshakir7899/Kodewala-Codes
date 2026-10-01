package com.flipkart.notification.consume;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Service;

import com.flipkart.notification.response.kafka.KafkaNotificationResponse;
import com.flipkart.notification.service.NotificationService;

import tools.jackson.databind.ObjectMapper;

@Service
public class KafkaNotificationConsumer
{

	@Autowired
	NotificationService notificationService;

	@RetryableTopic(attempts = "3", dltTopicSuffix = ".DLT")
	@KafkaListener(topics = { "${app.kafka.topic.order-created}", "${app.kafka.topic.payment-success}",
			"${app.kafka.topic.payment-failed}",
			"${app.kafka.topic.delivery-created}" }, groupId = "${app.kafka.consumer.group-id}")
	public void consumeMessage(ConsumerRecord<String, String> record)
	{

		ObjectMapper objectMapper = new ObjectMapper();

		KafkaNotificationResponse response = objectMapper.readValue(record.value(), KafkaNotificationResponse.class);

		notificationService.sendNotification(response);
	}
	

	@DltHandler
	public void handlingDlt(ConsumerRecord<String, String> record)
	{
		System.out.println("Message moved to DLT: " + record.value());
	}
}