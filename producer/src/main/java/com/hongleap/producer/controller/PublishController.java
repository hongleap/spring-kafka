package com.hongleap.producer.controller;

import com.hongleap.producer.dto.OrderProduct;
import com.hongleap.producer.dto.PaymentEvent;
import com.hongleap.producer.dto.UserEvent;
import com.hongleap.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/publishers")
@RequiredArgsConstructor
public class PublishController {

    private final ProducerService orderProducerService;

    @PostMapping("/orders")
    public void sendOrderEvent(@RequestBody OrderProduct order){
        orderProducerService.sendOrderEvent(order);
        System.out.print("Publish Order success");
    }

    @PostMapping("/users")
    public void sendUserEvent(@RequestBody UserEvent user){
        orderProducerService.sendUsersEvent(user);
        System.out.print("Publish user success");
    }

    @PostMapping("/payments")
    public void sendPaymentEvent(@RequestBody PaymentEvent payment){
        orderProducerService.sendPaymentEvent(payment);
        System.out.println("Publish payment success");
    }
}
