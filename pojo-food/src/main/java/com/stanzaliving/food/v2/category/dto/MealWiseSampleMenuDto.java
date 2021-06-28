package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.dto.MenuItemDto;
import com.stanzaliving.core.operations.enums.MealType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MealWiseSampleMenuDto implements Serializable {
    private MealType mealType;
    private Double weight;
    private Double cogs;
    private List<MenuItemDto> menuItems;



}
