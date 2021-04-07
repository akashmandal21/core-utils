package com.stanzaliving.core.food.dto.menu;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DayDefaultMenuDto {
    private DayOfWeek day;
    private FoodRegion foodRegion;
    private FoodItemBasePreference preference;
}
