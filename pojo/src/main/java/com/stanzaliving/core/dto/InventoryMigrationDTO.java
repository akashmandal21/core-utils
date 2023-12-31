package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryMigrationDTO {
    @JsonSetter(value = "RESIDENCE_ID")
    private Integer residenceId;

    @JsonSetter(value = "INVENTORY_ID")
    private Integer inventoryId;
}
