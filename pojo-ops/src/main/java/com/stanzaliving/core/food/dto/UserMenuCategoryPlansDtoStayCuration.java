package com.stanzaliving.core.food.dto;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserMenuCategoryPlansDtoStayCuration implements Serializable {

    private static final long serialVersionUID = 6843282985331216007L;

    private String menuId;
    private LocalDate planStartDate;
    private LocalDate planEndDate;
    private String planId;
    private String planName;
    private Map<MealType, List<DayOfWeek>> mealDays;
}
