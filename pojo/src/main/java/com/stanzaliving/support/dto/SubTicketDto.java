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
public class SubTicketDto {
    private String ticketUuid;
    private String subTicketUuid;
    private String subTicketId;
    private String taskTypeUuid;
    private String teamUuid;
    private String taskTypeDetail;
    private String teamDetail;
    private String assignedTo;
    private String assignedToUuid;
    private Date slaTime;
    private boolean markForDelay;
    private String description;
    private Date completionDate;
    private String reason;
    private Date tentativeDate;
    private String statusDetail;
    private Date createdAt;
    private String createdBy;
    private Date closedAt;
    private TicketChipColorDto ticketChipColorDto;
}
