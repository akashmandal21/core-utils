package com.stanzaliving.food.v2.dispatch;


import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ActualMealPlanTimeUpdateDto {

    private String residenceId;
    private LocalDate menuDate;
    private MealType mealType;
    private LocalTime receivingTime;

}
