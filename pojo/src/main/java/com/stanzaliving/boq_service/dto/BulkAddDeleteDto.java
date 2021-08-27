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
public class BulkAddDeleteDto {

    private LabelValueDto<String> areaOfUse;
    private LabelValueDto<BoqItemProvider> doneBy;
    private LabelValueDto<BoqItemProvider> budgetDoneBy;
    private ItemDetails itemDetails;
    private BigDecimal llrate;
    private List<PropertyDto> properties;
}
