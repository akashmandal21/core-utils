package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.generictaskservice.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 17-Aug-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class SlotFilterDto {

    private String slotName;
    private SlotType slotType;
    private Boolean overLap;
    private Boolean movable;
    private Boolean reschedule;
    private String minSlotDuration;
    private String maxSlotDuration;
    private List<String> allowedTaskList;
    private List<String> tagList;
    private PaginationRequest pageRequest;
}
