package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String label;
    private String value;
    private String itemCode;
    private String areaOfUse;
    private BoqItemProvider doneBy;
    private BoqItemProvider budgetDoneBy;
    private BigDecimal llrate;
    private List<Property> properties;
}
