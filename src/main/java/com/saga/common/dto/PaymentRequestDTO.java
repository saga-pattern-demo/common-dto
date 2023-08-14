package com.saga.common.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PaymentRequestDTO {
    private Integer userID;
    private UUID orderID;
    private Double amount;
}
