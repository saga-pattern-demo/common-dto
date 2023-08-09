package com.saga.commondto.dto;

import com.saga.commondto.enums.StockStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class StockResponseDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
    private StockStatus status;
}
