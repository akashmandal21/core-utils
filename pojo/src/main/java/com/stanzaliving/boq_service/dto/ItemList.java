package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemList {

    private String itemUuid;
    private String itemCode;
    private BigDecimal quantity;
    private String areaOfUse;
    private BoqItemProvider doneBy;
    private BigDecimal llrate;
    private BoqItemProvider budgetDoneBy;
}
