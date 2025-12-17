package com.app.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.app.model.Order;

@Service
public class KafkaOrderConsumerServiceImpl implements KafkaOrderConsumerService {
	
	@KafkaListener(topics = "order-topic", groupId = "group-1")
	@Override
	public void processOrder(Order order) {
		System.out.println(order);
	}
}
