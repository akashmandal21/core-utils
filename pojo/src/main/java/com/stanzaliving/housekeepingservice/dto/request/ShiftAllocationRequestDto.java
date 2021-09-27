package com.stanzaliving.housekeepingservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.ShiftDto;
import com.stanzaliving.generictaskservice.dto.SlotDto;
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
public class ShiftAllocationRequestDto extends AbstractDto {

    private String shiftUuid;

    private String slotUuid;

    private DayOfWeek shiftDay;

    private LocalTime startingTime;

    private LocalTime endingTime;

    private SlotDto slotDto;

    private ShiftDto shiftDto;

}
