package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class SpecialDayMealDto {

    private LocalDate date;

    private List<String> eventDescription;

    private List<MealType> mealTypeList;

}
