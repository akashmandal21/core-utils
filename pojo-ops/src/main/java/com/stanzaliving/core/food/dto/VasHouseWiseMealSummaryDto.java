package com.stanzaliving.core.food.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class VasHouseWiseMealSummaryDto {

    private String houseName;
    private int vegMealCount;
    private int nonVegMealCount;
    private String prepareBy;
    private String dispatchBy;
    private String deliverBy;
}
