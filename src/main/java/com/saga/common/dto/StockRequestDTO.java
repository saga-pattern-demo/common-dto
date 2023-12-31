package com.saga.common.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class StockRequestDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
}
