package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.generictaskservice.dto.response.TagResponseDto;
import com.stanzaliving.generictaskservice.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Vikas S T
 * @date 02-Aug-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotDto {

    @NotEmpty(message = "Allowed task is mandatory")
    private List<String> allowedTaskList;

    @NotBlank(message = "Entity type is mandatory")
    private String entityType;

    @Min(value = 1, message = "Duration Value cannot be less than 0")
    private Double defaultDuration;

    @NotBlank(message = "Entity uuid is mandatory")
    private String entityUuid;

    @NotNull(message = "Is movable slot is mandatory")
    private Boolean isMovableSlot;

    private Integer minimumSlotSize;

    private Integer maximumSlotSize;

    @NotNull(message = "Is overlapping allowed is mandatory")
    private Boolean isOverLappingAllowed;

    @NotNull(message = "Is rescheduling allowed is mandatory")
    private Boolean reschedulingAllowed;

    @NotBlank(message = "Slot name is mandatory")
    private String slotName;

    @NotBlank(message = "Slot source is mandatory")
    private String slotSource;

    @NotNull(message = "Slot type is mandatory")
    private SlotType slotType;

    private List<String> tagsUuid;

    private String slotUuid;

    private List<TagResponseDto> tags;

    private List<TaskCategoryDto> allowedTasksList;

    private LocalDate menuDate;

    private LocalTime localTime;
}
