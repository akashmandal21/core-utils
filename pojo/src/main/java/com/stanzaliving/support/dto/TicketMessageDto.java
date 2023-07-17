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
@AllArgsConstructor
@NoArgsConstructor
public class TicketMessageDto {
    private Long id;
    private String uuid;
    private String ticketUuid;
    private String message;
    private List<String> attachmentUuids;
    private String messagedBy;
    private String messagedByUuid;
    private boolean isPrivate;
    private Date createdAt;
    private boolean isDeleted;
    private TicketActivityTemplatesEnum type=TicketActivityTemplatesEnum.MESSAGE;
}
