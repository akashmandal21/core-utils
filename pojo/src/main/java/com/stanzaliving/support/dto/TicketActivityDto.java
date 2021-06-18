package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.TicketActivityTemplatesEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketActivityDto {
    private List<String> description;
    private String title;
    private String ticketUuid;
    private String actionedBy;
    private String actionedTo;
    private Date actionedTime;
    private boolean isMarkedPrivate;
    //    private MessageReference type = MessageReference.OTHER;
    private TicketActivityTemplatesEnum type = TicketActivityTemplatesEnum.OTHER;
    private Date createdAt;
    private String referenceId;
}
