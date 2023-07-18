package com.saga.commondto.dto;

import com.saga.commondto.enums.OrderStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class OrchestratorResponseDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private Double amount;
    private OrderStatus status;
}
