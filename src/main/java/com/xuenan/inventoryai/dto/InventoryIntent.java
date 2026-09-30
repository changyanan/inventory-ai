package com.xuenan.inventoryai.dto;

import lombok.Data;

@Data
public class InventoryIntent {
    private String productName;
    private String color;
    private String storage;
    private String warehouse;
    private Integer quantity;
}
