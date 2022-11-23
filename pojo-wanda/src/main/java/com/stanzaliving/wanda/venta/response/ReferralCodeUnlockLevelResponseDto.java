package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReferralCodeUnlockLevelResponseDto {
    private Integer levelNo;
    private Integer minCriteria;
    private Integer maxCriteria;
    private Double amount;
    @Builder.Default
    private Boolean currentLevel = Boolean.FALSE;
}
