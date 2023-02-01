package com.stanzaliving.operations.mongo.entity.servicemix;

import com.stanzaliving.core.food.dto.request.WeekWiseMenu;
import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.operations.dto.servicemix.BooleanConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class FoodMenuConfigV2 extends BooleanConfig {

    private String category;
    private boolean stanzaKitchen;
    private Double totalPrice;
    private Double breakfast;
    private Double lunch;
    private Double eveningSnacks;
    private Double dinner;
    @Builder.Default
    private boolean defaultPlan = false;
    private String foodMenuCategoryName;
    private String foodMenuCategoryCode;
    private Map<MealType, Double> meals;
    private List<WeekWiseMenu> weekMenus;

}
