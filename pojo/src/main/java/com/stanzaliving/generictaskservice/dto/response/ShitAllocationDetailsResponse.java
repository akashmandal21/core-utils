package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.generictaskservice.dto.ShiftAllocationDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.DayOfWeek;
import java.util.List;

/**
 * @author Vikas S T
 * @date 24-Aug-21
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShitAllocationDetailsResponse {
    private DayOfWeek day;
    private List<ShiftAllocationDto> shifts;
}
