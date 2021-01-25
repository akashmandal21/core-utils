package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 * @date 08-May-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryMealDto implements Serializable {

    private String menuCategoryId;

    private MealType mealType;

    private boolean status;

    private boolean mondayActive;

    private boolean tuesdayActive;

    private boolean wednesdayActive;

    private boolean thursdayActive;

    private boolean fridayActive;

    private boolean saturdayActive;

    private boolean sundayActive;

    private Double expectedVegCost;

    private Double expectedNonVegCost;

    private Double nonStanzaStaffCost;

    private LocalTime mealStartTime;

    private LocalTime mealEndTime;

    private LocalTime pickupStartTime;
    private LocalTime pickupEndTime;

    private LocalTime deliveryStartTime;
    private LocalTime deliveryEndTime;
    private int activeDays;

}