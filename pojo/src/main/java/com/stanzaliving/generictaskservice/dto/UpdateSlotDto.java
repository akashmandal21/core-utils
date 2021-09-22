package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.generictaskservice.enums.SlotStatus;
import com.stanzaliving.generictaskservice.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Vikas S T
 * @date 22-Sep-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSlotDto {

    private String uuid;

    private List<String> allowedTaskList;

    private String entityType;

    @Min(value = 1, message = "Duration Value cannot be less than 0")
    private Double defaultDuration;

    private String entityUuid;

    private Boolean isMovableSlot;

    private LocalTime minimumSlotTime;

    private LocalTime maximumSlotTime;

    private Boolean isOverLappingAllowed;

    private Boolean reschedulingAllowed;

    private String slotName;

    private String module;

    private SlotType slotType;

    private List<String> tagsUuid;

    private SlotStatus slotStatus;
}
