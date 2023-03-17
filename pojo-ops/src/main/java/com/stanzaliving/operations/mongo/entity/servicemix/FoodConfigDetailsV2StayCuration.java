package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.operations.dto.servicemix.FoodMealDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
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
    private Map<String, FoodMealDto> mealDays;
    private boolean active;
}
