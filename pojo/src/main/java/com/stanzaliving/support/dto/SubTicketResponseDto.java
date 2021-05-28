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
    private String assignedTo;
    private Date slaTime;
    private String comments;
    private String reason;
    private String taskType;
}
