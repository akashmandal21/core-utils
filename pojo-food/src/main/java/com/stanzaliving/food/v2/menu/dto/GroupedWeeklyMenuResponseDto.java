package com.stanzaliving.food.v2.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class GroupedWeeklyMenuResponseDto {

    List<WeeklyMenuResponseDto> weeklyMenuResponseDtoList;
    private boolean compositionRulesSatisfied;
    private boolean budgetUtilizationInLimit;
    private boolean mealOfDayDefined;
    private Double ratings;
    private boolean comboRulesSatisfied;
    private boolean menuDefined;
}
