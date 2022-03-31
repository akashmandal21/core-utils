package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.core.base.enums.Department;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class GrsiItemDto {

    private String itemUuid;
    private String itemCode;
    private Department itemDept;
    private String batchId;
    private String awlBatchId;
    private String fifoUuid;

    @Builder.Default
    private BigDecimal pieceDamaged = BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal cartonDamaged = BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal qcChk = BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal rePck = BigDecimal.ZERO;
    @Builder.Default
    private BigDecimal okQty = BigDecimal.ZERO;
    
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;//Unit Rate
    private BigDecimal quantity;
    private BigDecimal rentPeriod;
    private String gsriEventItemDetailsUuid;
}
