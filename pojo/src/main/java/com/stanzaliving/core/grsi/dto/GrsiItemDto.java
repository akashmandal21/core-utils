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
    private BigDecimal pieceDamaged = BigDecimal.ZERO;
    private BigDecimal cartonDamaged = BigDecimal.ZERO;
    private BigDecimal qcChk = BigDecimal.ZERO;
    private BigDecimal rePck = BigDecimal.ZERO;
    private BigDecimal okQty = BigDecimal.ZERO;
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;//Unit Rate
    private BigDecimal quantity;
    private BigDecimal rentPeriod;
    private String gsriEventItemDetailsUuid;
}
