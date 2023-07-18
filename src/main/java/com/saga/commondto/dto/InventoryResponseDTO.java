package com.saga.commondto.dto;

import com.saga.commondto.enums.InventoryStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class InventoryResponseDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private InventoryStatus status;
}
