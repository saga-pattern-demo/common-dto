package com.saga.common.dto;

import com.saga.common.enums.PaymentStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentResponseDTO {
    private Integer userID;
    private UUID orderID;
    private Double amount;
    private PaymentStatus status;
}
