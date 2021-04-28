package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubTicketCardDto {

    private Long subTicketId;
    private Long ticketId;
    private String subTicketUuid;
    private String taskTypeUuid;
    private String comments;
    private Date sla;
    private Date createdAt;
    private String status;
    private String residenceName;
    private String roomNumber;
}
