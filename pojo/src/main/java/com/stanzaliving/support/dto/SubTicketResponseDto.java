package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.StatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    private String houseName;
    private String roomNumber;
}
