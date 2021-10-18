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
    private BigDecimal pieceDamaged;
    private BigDecimal cartonDamaged;
    private BigDecimal qcChk;
    private BigDecimal rePck;
    private BigDecimal totalQuantity;
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;//Unit Rate
    private BigDecimal quantity;
    private BigDecimal rentPeriod;
    private String gsriEventItemDetailsUuid;
}
