package com.stanzaliving.core.food.dto.menu;

import com.stanzaliving.core.food.enums.FoodItemBasePreference;
import com.stanzaliving.core.food.enums.FoodRegion;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceDefaultMenuDto {
    private String residenceId;
    private String name;

    private boolean dayLevelDetails;
    private FoodRegion foodRegion;
    private FoodItemBasePreference preference;
    private boolean isAllowed;

    private List<DayDefaultMenuDto> dayDetails;
}
