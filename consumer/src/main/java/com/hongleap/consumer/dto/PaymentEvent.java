package com.hongleap.consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentEvent {
    private String paymentId;
    private String orderId;
    private String userId;
    private double amount;
    private String currency;
}