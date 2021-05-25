package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketCardDto {

    private Long ticketId;
    private String ticketUuid;
    private String ticketStatus;
    private Date createdAt;
    private Date sla;
    private String description;
    private String categoryName;
    private String subCategoryName;
    private String userName;
    private String userCode;
    private String residenceName;
    private String roomNumber;
}

