package com.hongleap.producer.service;

import com.hongleap.producer.dto.OrderProduct;

import com.hongleap.producer.dto.PaymentEvent;
import com.hongleap.producer.dto.UserEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<String,Object> kafkaTemplate;

    public ProducerService(KafkaTemplate<String,Object> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderEvent(OrderProduct order) {
        kafkaTemplate.send("order-topic","order", order);
        System.out.println("Order sent: " + order.getOrderId());
    }

    public void sendUsersEvent(UserEvent user) {
        kafkaTemplate.send("user-topic","users", user);
        System.out.println("User sent: " + user.getName());
    }

    public void sendPaymentEvent(PaymentEvent payment){
        kafkaTemplate.send("payment-topic", "payment", payment);
        System.out.println("Payment sent: " + payment.getPaymentId());
    }

}
