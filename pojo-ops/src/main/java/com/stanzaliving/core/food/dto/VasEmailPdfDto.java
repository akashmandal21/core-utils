package com.stanzaliving.core.food.dto;

import java.util.Map;
import java.util.Set;

import com.stanzaliving.core.food.enums.FoodItemType;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VasEmailPdfDto {

    private String vendorName;
    private String mealName;
    private String deliveryDate;

    private Map<FoodItemType, Set<String>> itemNames;
    private Map<String,String> consolidated;
    private Map<String,Map<String,Integer>> itemWiseSummary;
    private Map<String,VasHouseWiseMealSummaryDto> houseWiseMealSummary;
}