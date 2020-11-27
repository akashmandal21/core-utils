package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.food.dto.response.DishDetailsResponseDto;
import com.stanzaliving.core.food.dto.response.VasMasterPackagingResponseDto;
import com.stanzaliving.core.food.enums.FoodItemType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeVasItemDto {
    private String itemId;
    private String name;
    private String category;
    private boolean containsEgg;
    private boolean nonVeg;
    private boolean specialVeg;
    private Integer shelfLife;
    private String description;
    private String image;
    private Integer serves;
    private List<DishDetailsResponseDto> dishes;
    private List<String> accompaniments;
    private boolean quantifiable;
    private Double grammage;
    private Integer quantity;
    private FoodItemType foodType;
    private List<VasMasterPackagingResponseDto> packaging;

}
