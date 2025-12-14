package com.hongleap.producer.service;

import com.hongleap.producer.dto.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducerService {

    @Autowired
    private KafkaTemplate<String, OrderProduct> kafkaTemplate;

    // set topic
    private static final String TOPIC = "order-topic";

    public void sendOrder(OrderProduct order) {
        kafkaTemplate.send(TOPIC, order);
        System.out.println("Order sent: " + order.getOrderId());
    }

}
