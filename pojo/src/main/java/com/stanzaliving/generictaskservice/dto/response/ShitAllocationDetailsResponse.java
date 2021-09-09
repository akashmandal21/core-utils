package com.stanzaliving.generictaskservice.dto.response;

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
    private List<ShiftDetailsResponse> shifts;
}
