package com.stanzaliving.core.estate.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class LeasedInventoryDto {
    private List<LeasedInventoryDetails> leasedInventory;
}
