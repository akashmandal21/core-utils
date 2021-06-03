package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealDto {
    private String mealId;
    private MealType mealType;
    private String name;
    private String code;
    private String mealGroupId;
    private String mealGroup;
    private String imageUri;
}
