package com.hongleap.consumer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class OrderProduct {
    private String orderId;
    private String productName;
    private int quantity;
}

