package com.stanzaliving.core.estate.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LeasedInventoryDetails {
    private String leasedInventoryItemName;
    private Double leasedInventoryItemCount;
}

