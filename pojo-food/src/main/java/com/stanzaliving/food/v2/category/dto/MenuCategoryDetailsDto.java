package com.stanzaliving.food.v2.category.dto;


import com.stanzaliving.core.food.enums.MenuType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
public class MenuCategoryDetailsDto implements Serializable {
    private String uuid;
    private String categoryId;
    private String vendorId;
    private MenuType menuType;
    private Double marginCost;
    private Double utilityCost;
    private List<MenuCategoryMealDto> mealData;
}
