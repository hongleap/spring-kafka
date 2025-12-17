package com.hongleap.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void listen(Object data) {
        System.out.println("ORDER MESSAGE = " + data);
    }

    @KafkaListener(topics = "user-topic", groupId = "user-group")
    public void listenUser(Object data) {
        System.out.println("USER MESSAGE = " + data);
    }

    @KafkaListener(topics = "payment-topic", groupId = "payment-group")
    public void listenPayment(Object data) {
        System.out.println("PAYMENT MESSAGE = " + data);
    }

}
