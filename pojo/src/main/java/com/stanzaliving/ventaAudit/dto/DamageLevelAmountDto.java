package com.stanzaliving.ventaAudit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DamageLevelAmountDto {
    private Double missingItemAmount;
    private Double majorDamageAmount;
    private Double minorDamageAmount;
    private Double noDamageAmount;
}
