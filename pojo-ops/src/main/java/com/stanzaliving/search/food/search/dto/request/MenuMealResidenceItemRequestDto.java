package com.stanzaliving.search.food.search.dto.request;

import com.stanzaliving.core.food.dto.OperatorValueDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuMealResidenceItemRequestDto extends MenuResidenceAggregateRequestDto {

    private List<MealItemRequestDto> mealItems;

    private OperatorValueDto<Float> minAvgRating;

}
