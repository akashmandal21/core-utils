package com.stanzaliving.food.v2.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
public class MealDto {
    private String mealId;
    private String name;
}
