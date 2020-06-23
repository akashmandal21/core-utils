package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.food.enums.MenuType;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava
 *
 * @date 23-June-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VasOrderFoodMenuDto {
    private String vasOrderId;

    private String residenceId;

    private String vendorId;

    private MealType mealType;

    private String menuCategoryId;

    private String microMarketId;
}
