package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.enums.CostType;
import com.stanzaliving.core.operations.enums.ViewType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CostEfficiencyFoodReportRequestDto extends FoodReportRequestDto {

    @NotNull ViewType viewType;

    @NotNull CostType costType;

}
