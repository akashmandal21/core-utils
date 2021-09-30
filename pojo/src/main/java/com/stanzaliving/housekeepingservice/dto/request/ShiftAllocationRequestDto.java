package com.stanzaliving.housekeepingservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 26-Sep-21
 **/

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShiftAllocationRequestDto {

    private String shiftUuid;

    private String slotUuid;

    private DayOfWeek shiftDay;

    private LocalTime startingTime;

    private LocalTime endingTime;

}
