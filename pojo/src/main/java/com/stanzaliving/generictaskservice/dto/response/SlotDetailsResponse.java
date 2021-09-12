package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import com.stanzaliving.generictaskservice.dto.TaskCategoryDto;
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
public class SlotDetailsResponse {

    private SlotType slotType;

    private List<String> tagsUuid;

    private String slotUuid;

    private List<TagResponseDto> tags;

    private List<TaskCategoryDto> allowedTasksList;

    private String module;

    private String slotName;

    private Boolean reschedulingAllowed;

    private Boolean isOverLappingAllowed;

    private Boolean isMovableSlot;

    private LocalTime minimumSlotSize;

    private LocalTime maximumSlotSize;

    private String entityUuid;

    private Double defaultDuration;

    private String entityType;

    private List<GenericTaskDto> tasks = new ArrayList<>();
}
