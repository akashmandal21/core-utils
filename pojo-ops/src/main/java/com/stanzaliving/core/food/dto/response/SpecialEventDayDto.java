package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.enums.FoodDayType;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SpecialEventDayDto {

    private LocalDate date;

    private FoodDayType dayType;

    private boolean specialEventExist;

    private List<SpecialEventDto> specialEventDtoList;
    
}
