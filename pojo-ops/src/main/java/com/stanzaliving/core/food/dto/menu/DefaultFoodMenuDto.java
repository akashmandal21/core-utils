package com.stanzaliving.core.food.dto.menu;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultFoodMenuDto implements Serializable {
    private String menuGroupId;
    private boolean isValid;
    private List<DefaultMealMenuDto> mealDetails;
}
