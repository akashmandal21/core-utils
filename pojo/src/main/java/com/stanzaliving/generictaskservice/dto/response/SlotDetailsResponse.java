package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikas S T
 * @date 29-Aug-21
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotDetailsResponse extends AbstractDto {

    private SlotType slotType;

    private List<String> tagsUuid;

    private List<TagResponseDto> tags;

    private List<TemplateAllowedTaskResponseDto> allowedTasksList;

    private String shiftAllocationUuid;

    private String module;

    private String slotName;

    private Boolean reschedulingAllowed;

    private Boolean isOverLappingAllowed;

    private Boolean isMovableSlot;

    private LocalTime minimumSlotTime;

    private LocalTime maximumSlotTime;

    private String entityUuid;

    private LocalTime defaultDuration;

    private String entityType;

    private List<GenericTaskBeatPlanResponseDto> tasks = new ArrayList<>();

    private LocalTime startTime;

    private LocalTime endTime;

}
