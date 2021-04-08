package com.stanzaliving.core.food.dto.menu;

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
    private String mealSelected;
    private boolean isAllowed;

    private List<DayDefaultMenuDto> dayDetails;
}
