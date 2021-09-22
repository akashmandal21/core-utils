package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
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
public class ShiftDetailsResponse extends AbstractDto {
    private String module;
    private String shiftName;
    private Double durationInHours;
    private LocalTime startTime;
    private LocalTime endTime;
    private List<GenericTaskResponseDto> tasks;
    private List<SlotDetailsResponse> slots;
}
