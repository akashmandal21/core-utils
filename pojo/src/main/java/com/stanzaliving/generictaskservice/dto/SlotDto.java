package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import com.stanzaliving.generictaskservice.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Vikas S T
 * @date 25-Aug-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotDto extends AbstractDto {

    private List<String> allowedTaskList;

    private String entityType;

    private String slotUuid;

    @Min(value = 1, message = "Duration Value cannot be less than 0")
    private Double defaultDuration;

    private String entityUuid;

    @NotNull(message = "Is movable slot is mandatory")
    private Boolean isMovableSlot;

    private LocalTime minimumSlotTime;

    private LocalTime maximumSlotTime;

    @NotNull(message = "Is overlapping allowed is mandatory")
    private Boolean isOverLappingAllowed;

    @NotNull(message = "Is rescheduling allowed is mandatory")
    private Boolean reschedulingAllowed;

    @NotBlank(message = "Slot name is mandatory")
    private String slotName;

    @NotBlank(message = "Module is mandatory")
    private String module;

    @NotNull(message = "Slot type is mandatory")
    private SlotType slotType;

    private String slotSource;

    private List<String> tagsUuid;

    private List<TagResponseDto> tags;

    private List<TaskCategoryDto> allowedTasksList;

}