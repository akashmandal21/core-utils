package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.core.food.enums.MenuType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryVersionDto extends MenuCategoryDTO {
    private String curVersionId;
    private MenuType menuType;
    private Double marginCost;
    private Double utilityCost;
    private List<MenuCategoryMealDto> mealData;
}
