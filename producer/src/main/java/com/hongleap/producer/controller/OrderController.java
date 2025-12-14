package com.hongleap.producer.controller;

import com.hongleap.producer.dto.OrderProduct;
import com.hongleap.producer.service.OrderProducerService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducerService orderProducer;

    @PostMapping
    public String placeOrder() {

        OrderProduct order = new OrderProduct(
                "ORD-101",
                "Laptop",
                2
        );

        orderProducer.sendOrder(order);

        return "Order placed successfully";
    }
}
