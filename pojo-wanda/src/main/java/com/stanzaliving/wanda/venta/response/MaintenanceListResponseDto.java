package com.stanzaliving.wanda.venta.response;

import lombok.Data;

@Data
public class MaintenanceListResponseDto {
    private double amount;
    private String name;
    private int id;
    private boolean selected;
}
