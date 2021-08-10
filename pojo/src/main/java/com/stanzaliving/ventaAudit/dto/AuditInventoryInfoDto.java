package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuditInventoryInfoDto {
    private String roomNumber;
    private String roomElementsUuid;
    private String roomUuid;
    private String inventoryName;
    private Double damageAmount;
    private String inventoryChecklistUuid;
}
