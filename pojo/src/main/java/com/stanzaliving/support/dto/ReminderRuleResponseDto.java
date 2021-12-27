package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.ReminderActionType;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReminderRuleResponseDto {
    private Set<SubCategoryDto> subCategoryDtoList;
    private Set<SubTicketTaskDto> subTicketTaskDtoList;
    private Set<LocationDto> locationDto;
    private String complaintGroupUuid;
    private String complaintGroup;
    private String categoryUuid;
    private String category;
    private TicketType ticketType;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
    private ReminderDetailsDto reminderDetailsDto;
}
