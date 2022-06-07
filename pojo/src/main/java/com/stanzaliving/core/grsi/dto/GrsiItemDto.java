package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.boq_service.enums.BoqLabel;
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
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;//Unit Rate
    private BigDecimal quantity;
    private BigDecimal rentPeriod;
    private String gsriEventItemDetailsUuid;

//    @Builder.Default
//    private BoqLabel boqLabel = BoqLabel.NA;
}
