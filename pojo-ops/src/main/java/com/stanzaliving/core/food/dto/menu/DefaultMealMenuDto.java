package com.stanzaliving.core.food.dto.menu;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultMealMenuDto {
    private MealType mealType;
    private List<ResidenceDefaultMenuDto> residenceDetails;
}
