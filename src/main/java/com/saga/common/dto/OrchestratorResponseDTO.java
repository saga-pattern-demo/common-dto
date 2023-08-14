package com.saga.common.dto;

import com.saga.common.enums.OrderStatus;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
public class OrchestratorResponseDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private Double amount;
    private OrderStatus status;
}
