package com.stanzaliving.core.food.dto.menu;

import com.stanzaliving.core.base.common.dto.ListingDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultFoodMenuRDto implements Serializable {
    private DefaultFoodMenuDto menuData;
    private Map<MealType, List<ListingDto>> mealWiseListing;
    private Map<MealType, Map<String,List<ListingDto>>> mealResidenceWiseListing;
    private Map<MealType, Map<String,Map<DayOfWeek,List<ListingDto>>>> mealResidenceDayWiseListing;
}
