package com.hongleap.consumer.service;

import com.hongleap.consumer.dto.OrderProduct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void receiveOrder(OrderProduct order) {
        System.out.println("Order received:");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Product: " + order.getProductName());
        System.out.println("Quantity: " + order.getQuantity());
    }
}
