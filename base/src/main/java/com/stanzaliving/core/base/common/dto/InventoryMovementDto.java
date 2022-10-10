package com.stanzaliving.core.base.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryMovementDto {
    private String itemUuid;
    private String gsriId;

}
