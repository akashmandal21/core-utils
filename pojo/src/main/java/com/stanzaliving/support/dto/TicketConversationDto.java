package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.TicketActivityTemplatesEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketConversationDto {
    private List<String> description;
    private String title;
    private String ticketUuid;
    private String actionedBy;
    private String actionedByUuid;
    private String actionedTo;
    private boolean isPrivate;
    private TicketActivityTemplatesEnum type = TicketActivityTemplatesEnum.OTHER;
    private Date createdAt;
    private String uuid;
    private String message;
    private String attachmentLocation;
    private String status;
    private String team;
    private String id;
    private String taskType;
    private List<String> attachmentPaths;
    private String attachmentType;
    private String slaStatus;
    private long fileSize;
    private boolean isDeleted;
}
