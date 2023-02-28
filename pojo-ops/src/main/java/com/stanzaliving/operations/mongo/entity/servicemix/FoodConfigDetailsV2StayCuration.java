package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.core.operations.enums.MealType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class FoodConfigDetailsV2StayCuration implements Serializable {
    private String planId;
    private String planCode;
    private String planName;
    private Double planPrice;
    private Map<MealType, List<DayOfWeek>> mealDays;
    private boolean active;
}
