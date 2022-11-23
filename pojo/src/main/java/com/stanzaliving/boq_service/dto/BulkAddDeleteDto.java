package com.stanzaliving.boq_service.dto;

import com.stanzaliving.core.boq_service.enums.BoqItemProvider;
import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BulkAddDeleteDto {

    private LabelValueDto<AreaOfUse> areaOfUse;

    private LabelValueDto<BoqItemProvider> doneBy;

    private LabelValueDto<BoqItemProvider> budgetDoneBy;

    @NotBlank
    @Valid
    private ItemDetails itemDetails;

    private String llrate;

    @NotBlank
    private List<@Valid PropertyDto> properties;
}
