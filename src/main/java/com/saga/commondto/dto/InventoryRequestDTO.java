package com.saga.commondto.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class InventoryRequestDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
}
