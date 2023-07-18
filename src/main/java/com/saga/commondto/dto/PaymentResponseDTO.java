package com.saga.commondto.dto;

import com.saga.commondto.enums.PaymentStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class PaymentResponseDTO {
    private Integer userID;
    private UUID orderID;
    private Double amount;
    private PaymentStatus status;
}
