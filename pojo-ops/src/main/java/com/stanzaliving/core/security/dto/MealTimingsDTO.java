package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.operations.enums.MealType;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealTimingsDTO {

    private MealType mealType;
    private LocalTime startTime;
    private LocalTime endTime;
}
