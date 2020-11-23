package com.stanzaliving.core.grsi.dto;

import com.stanzaliving.core.base.enums.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrsiItemDto {

    private String itemUuid;
    private Department itemDept;
    private String batchId;
    private LocalDate expiryDate; //expiryOn
    private BigDecimal effectivePrice; //unitRate
    private BigDecimal quantity;

}
