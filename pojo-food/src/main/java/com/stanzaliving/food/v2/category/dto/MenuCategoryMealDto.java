package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.food.v2.common.dto.MealDto;
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
public class MenuCategoryMealDto extends MealDto {
    private boolean enabled;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;

    private Double packagingCost;
    private Double vegCogs;
    private Double nonVegCogs;
    private Double externalStaffCogs;
    private Double optInPercentage;

    private Double mealCost;
    private Double trueCost;
    
    private Double fnbMealCost;
    private Double fnbTrueCost;
    
    private int activeDays;
}
