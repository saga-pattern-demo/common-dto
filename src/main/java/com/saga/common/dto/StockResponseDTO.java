package com.saga.common.dto;

import com.saga.common.enums.StockStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class StockResponseDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private StockStatus status;
}
