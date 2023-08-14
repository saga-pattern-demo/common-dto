package com.saga.common.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrchestratorRequestDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private Double amount;
}
