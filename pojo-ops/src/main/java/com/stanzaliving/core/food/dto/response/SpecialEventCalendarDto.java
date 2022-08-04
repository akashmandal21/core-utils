package com.stanzaliving.core.food.dto.response;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SpecialEventCalendarDto {

    @NotNull(message = "Month is mandatory")
    private Integer month;

    @NotNull(message = "Year is mandatory")
    private Integer year;

    @NotEmpty(message = "Calendar days are mandatory for month")
    private List<SpecialEventDayDto> specialEventDayDtoList;
    
    
}
