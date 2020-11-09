package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class GrsiItemDto {

    private String itemUuid;
    private Department itemDept;
    private String batchId;
    private LocalDate expiryDate;
    private BigDecimal effectivePrice;
    private BigDecimal quantity;

}
