package com.stanzaliving.residenceservice.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDetailsRequestDto {

    Collection<String> inventoryUuid;
    String fromDate;
    String toDate;
}
