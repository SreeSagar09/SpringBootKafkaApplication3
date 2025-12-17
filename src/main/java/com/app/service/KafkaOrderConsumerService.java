package com.app.service;

import com.app.model.Order;

public interface KafkaOrderConsumerService {
	public void processOrder(Order order);
}
