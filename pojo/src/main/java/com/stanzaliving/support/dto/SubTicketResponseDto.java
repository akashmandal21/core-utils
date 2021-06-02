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
    private Long ticketId;
    private String taskTypeUuid;
    private String subTicketUuid;
    private Long subTicketId;
    private String team;
    private String teamUuid;
    private String assignedTo;
    private String assignedToUuid;
    private Date slaTime;
    private String comments;
    private String reason;
    private String taskType;
    private String status;
    private String statusUuid;
    private String createdBy;
    private String createdByUuid;
    private String updatedByUuid;
}
