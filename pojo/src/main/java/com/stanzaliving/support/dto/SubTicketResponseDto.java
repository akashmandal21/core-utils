package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubTicketResponseDto {
    private String primaryTicketUuid;
    private String subTicketUuid;
    private Date dueDate;
    private String taskType;
    private String taskTypeUuid;
    private String description;
    private String houseName;
    private String roomNumber;
}
