package com.saga.commondto.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class OrderRequestDTO {
    private Integer userID;
    private Integer productID;
    private UUID orderID;
}
