package com.saga.common.dto;

import com.saga.common.enums.OrderStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderResponseDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private Double amount;
    private OrderStatus status;
}
