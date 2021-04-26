package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.food.v2.common.dto.MealDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@Getter
@Setter
@ToString
@SuperBuilder
public class MenuCategoryMealDto extends MealDto {
    private boolean enabled;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;
    private LocalTime startTime;
    private LocalTime endTime;
    private Double packagingCost;
    private Double vegCogs;
    private Double nonVegCogs;
    private Double externalStaffCogs;
}
